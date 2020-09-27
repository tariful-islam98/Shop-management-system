package admin;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import shopmanagement.Top2Controller;

public class EditEmployeeController implements Initializable {

    @FXML
    private TextField nameField;
    @FXML
    private TextField addressField;
    @FXML
    private TextField contactField;
    @FXML
    private TextField salaryField;
    @FXML
    private TextField newPswrdField;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Top2Controller.backBtnVal = "Employee.fxml";
    }

    @FXML
    private void confirmButtonAction(ActionEvent event) {
    }

}
