package shopmanagement;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class UserAccountController implements Initializable {

    @FXML
    private TextField nameField;
    @FXML
    private TextField addressField;
    @FXML
    private TextField contactField;
    @FXML
    private TextField salaryField;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Top2Controller.backBtnVal = "Otions.fxml";
    }

    @FXML
    private void salaryInfoBtnAction(ActionEvent event) throws IOException {
        HomePageController.bdrpn.setCenter(FXMLLoader.load(getClass().getResource("SalaryInfo.fxml")));
    }

}
