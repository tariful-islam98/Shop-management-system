package shopmanagement;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

public class LogoutController implements Initializable {

    public static int logoutBtnVal = 0;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void logoutButtonAction(ActionEvent event) throws IOException {
        if (logoutBtnVal == 0) {
            HomePageController.bdrpn.setCenter(FXMLLoader.load(getClass().getResource("LoginPage.fxml")));
            HomePageController.bdrpn.setBottom(null);
            HomePageController.bdrpn.setTop(FXMLLoader.load(getClass().getResource("Top3.fxml")));
        }
        if (logoutBtnVal == 1) {
            HomePageController.bdrpn.setCenter(FXMLLoader.load(getClass().getResource("/admin/AdminLogin.fxml")));
            HomePageController.bdrpn.setTop(FXMLLoader.load(getClass().getResource("Top3.fxml")));
            HomePageController.bdrpn.setBottom(null);
            logoutBtnVal = 0;
            Top2Controller.backBtnVal = 0;
        }
    }

}
