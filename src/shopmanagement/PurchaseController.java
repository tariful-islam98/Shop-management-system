package shopmanagement;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class PurchaseController implements Initializable {

    @FXML
    private ChoiceBox<?> itemField;
    @FXML
    private TextField quantityField;
    @FXML
    private TextField ppuField;
    @FXML
    private TextField totalCost;
    @FXML
    private TextField supplierNameField;
    @FXML
    private TextField supplierAdrsField;
    @FXML
    private TextField contactField;
    @FXML
    private DatePicker dateField;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Top2Controller.backBtnVal = "Otions.fxml";
    }

    @FXML
    private void addButtonAction(ActionEvent event) {
    }

}
