package shopmanagement;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

public class LoginOptionsController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void employeeLoginBtnAction(ActionEvent event) throws IOException {
        HomePageController.bdrpn.setCenter(FXMLLoader.load(getClass().getResource("LoginPage.fxml")));
        HomePageController.bdrpn.setTop(FXMLLoader.load(getClass().getResource("Top3.fxml")));
    }

    @FXML
    private void adminLoginBtnAction(ActionEvent event) throws IOException {
        HomePageController.bdrpn.setCenter(FXMLLoader.load(getClass().getResource("/admin/AdminLogin.fxml")));
        HomePageController.bdrpn.setTop(FXMLLoader.load(getClass().getResource("Top3.fxml")));
    }

}
