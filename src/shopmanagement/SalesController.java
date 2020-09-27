package shopmanagement;

import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Window;

public class SalesController implements Initializable {

    @FXML
    private ChoiceBox<String> itemField;
    @FXML
    private TextField availableQntField;
    @FXML
    private TextField ppuField;
    @FXML
    private TextField quantityField;
    @FXML
    private TextField totalPriceField;
    @FXML
    private TextField customerNameField;
    @FXML
    private TextField customerAdrsField;
    @FXML
    private TextField contactField;
    @FXML
    private DatePicker dateField;
    @FXML
    private Button sellButton;

    public static int pricePerUnit = 0;
    public static int totalPrice = 0;
    public static boolean oldCustomer = false;
    public static boolean temp1;
    public static int productId;
    public static int avlQntt;
    public static int cusId;
    DbAction db = new DbAction();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            Connection con = db.getConnection();

            String query1 = "select Product_name from products";

            ResultSet rs = con.createStatement().executeQuery(query1);
            while (rs.next()) {
                itemField.getItems().addAll(rs.getString("Product_name"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(SalesController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    private void sellButtonAction(ActionEvent event) throws SQLException {
        Connection con = db.getConnection();
        Window owner = sellButton.getScene().getWindow();

        String item = itemField.getValue();
        int avblQntt = Integer.parseInt(availableQntField.getText());
        int ppu = Integer.parseInt(ppuField.getText());
        int qntt = Integer.parseInt(quantityField.getText());
        int totalPrice = Integer.parseInt(totalPriceField.getText());
        String cusName = customerNameField.getText();
        String cusAdrs = customerAdrsField.getText();
        int cntct = Integer.parseInt(contactField.getText());
        LocalDate date = dateField.getValue();
        int qntt2 = avlQntt - qntt;

        String query3 = "insert into customer(Customer_name, Customer_Contact, Address) "
                + "values('" + cusName + "', " + cntct + ", '" + cusAdrs + "')";
        String query4 = "insert into sale(Product_id, Quantity, Total_Price, Customer_id, Date) "
                + "values(" + productId + ", " + qntt + ", " + totalPrice + ", " + cusId + ", '" + date + "')";
        String query6 = "update products "
                + "set Quantity = " + qntt2 + " where Product_Id =" + productId;

        if (oldCustomer == false) {
            if (con.createStatement().executeUpdate(query3) > 0) {
                temp1 = true;
            } else {
                temp1 = false;
            }
        }

        if (con.createStatement().executeUpdate(query4) > 0 && con.createStatement().executeUpdate(query6) > 0) {
            if (temp1 == true || oldCustomer == true) {
                ShowAlert.viewAlert(Alert.AlertType.CONFIRMATION, owner, "Successful", "Sale Information added successfully!");
                itemField.setValue(null);
                quantityField.clear();
                ppuField.clear();
                availableQntField.clear();
                totalPriceField.clear();
                customerAdrsField.clear();
                customerNameField.clear();
                contactField.clear();
            }
        } else {
            ShowAlert.viewAlert(Alert.AlertType.ERROR, owner, "Failed", "Sale Information update failed!");
        }

    }

    @FXML
    private void itemFieldAction(MouseEvent event) throws SQLException {
        Connection con = db.getConnection();

        String item = itemField.getValue();

        String query2 = "select * from products "
                + "where Product_name = '" + item + "'";
        ResultSet rs = con.createStatement().executeQuery(query2);
        while (rs.next()) {
            productId = rs.getInt("Product_Id");
            avlQntt = rs.getInt("Quantity");
            int ppu = rs.getInt("Price");
            ppuField.setText("" + ppu);
            availableQntField.setText("" + avlQntt);
            this.pricePerUnit = ppu;
        }
    }

    @FXML
    private void quantityFieldAction(KeyEvent event) {
        if (!quantityField.getText().isEmpty()) {
            int qntt = Integer.parseInt(quantityField.getText());
            this.totalPrice = qntt * this.pricePerUnit;
            totalPriceField.setText("" + totalPrice);
        } else {
            totalPriceField.setText(null);
        }
    }

    @FXML
    private void cusNameFieldAction(KeyEvent event) throws SQLException {
        if (!customerNameField.getText().isEmpty()) {
            Connection con = db.getConnection();
            String cnm = customerNameField.getText();
            String qr = "select * from customer "
                    + "where Customer_name = '" + cnm + "'";
            ResultSet rs = con.createStatement().executeQuery(qr);
            if (rs.next()) {
                customerAdrsField.setText(rs.getString("Address"));
                contactField.setText("" + rs.getInt("Customer_Contact"));
                this.oldCustomer = true;
                cusId = rs.getInt("Customer_id");
            } else {
                customerAdrsField.setText(null);
                contactField.setText(null);
                this.oldCustomer = false;
                
                String qr1 = "select Customer_id from customer order by Customer_id desc limit 1";
                ResultSet rs1 = con.createStatement().executeQuery(qr1);
                while(rs1.next()){
                    cusId = rs1.getInt("Customer_id") + 1;
                }
            }
        } else {
            return;
        }
    }
}
