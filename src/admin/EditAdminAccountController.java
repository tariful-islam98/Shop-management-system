package admin;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import shopmanagement.Top2Controller;

public class EditAdminAccountController implements Initializable {

    @FXML
    private TextField nameField;
    @FXML
    private TextField addressField;
    @FXML
    private TextField contactField;
    @FXML
    private TextField oldPswrdField;
    @FXML
    private TextField newPswrdField;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Top2Controller.backBtnVal = "AdminAccount.fxml";
    }

    @FXML
    private void confirmButtonAction(ActionEvent event) {
    }

}
