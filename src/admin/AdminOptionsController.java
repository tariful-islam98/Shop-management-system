package admin;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import shopmanagement.HomePageController;

public class AdminOptionsController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void adminAccButtonAction(ActionEvent event) throws IOException {
        HomePageController.bdrpn.setCenter(FXMLLoader.load(getClass().getResource("AdminAccount.fxml")));
    }

    @FXML
    private void employeeButtonAction(ActionEvent event) throws IOException {
        HomePageController.bdrpn.setCenter(FXMLLoader.load(getClass().getResource("Employee.fxml")));
    }

    @FXML
    private void newEmployeeButtonAction(ActionEvent event) throws IOException {
        HomePageController.bdrpn.setCenter(FXMLLoader.load(getClass().getResource("AddEmployee.fxml")));
    }

    @FXML
    private void newProductsButtonAction(ActionEvent event) throws IOException {
        HomePageController.bdrpn.setCenter(FXMLLoader.load(getClass().getResource("NewProduct.fxml")));
    }

    @FXML
    private void emplyeeSlrBtnAction(ActionEvent event) throws IOException {
        HomePageController.bdrpn.setCenter(FXMLLoader.load(getClass().getResource("EmployeeSalary.fxml")));
    }

}
