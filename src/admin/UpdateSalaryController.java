package admin;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import shopmanagement.Top2Controller;

public class UpdateSalaryController implements Initializable {

    @FXML
    private TextField nameField;
    @FXML
    private TextField salaryField;
    @FXML
    private TextField monthField;
    @FXML
    private TextField yearField;
    @FXML
    private TextField dueField;
    @FXML
    private TextField amountField;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
       // Top2Controller.backBtnVal = "EmployeeSalary.fxml";
    }

    @FXML
    private void updateButtonAction(ActionEvent event) {
    }

}
