package admin;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Window;
import shopmanagement.*;

public class AdminLoginController implements Initializable {

    @FXML
    private TextField adminNameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Button loginButton;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void loginButtonAction(ActionEvent event) throws IOException, SQLException {
        Window owner = loginButton.getScene().getWindow();

        if (adminNameField.getText().isEmpty()) {
            ShowAlert.viewAlert(Alert.AlertType.ERROR, owner, "Input Error", "Please Enter User Name");
            return;
        }
        if (passwordField.getText().isEmpty()) {
            ShowAlert.viewAlert(Alert.AlertType.ERROR, owner, "Input Error", "Please Enter Password");
            return;
        }

        String adminName = adminNameField.getText();
        String password = passwordField.getText();

        DbAction db = new DbAction();
        Connection con = db.getConnection();

        String query = "select * from admin "
                + "where Admin_name = '" + adminName + "' and Password = '" + password + "'";
        ResultSet rs = con.createStatement().executeQuery(query);

        if (rs.next()) {
            HomePageController.bdrpn.setCenter(FXMLLoader.load(getClass().getResource("AdminOptions.fxml")));
            HomePageController.bdrpn.setTop(FXMLLoader.load(getClass().getResource("/shopmanagement/Top2.fxml")));
            HomePageController.bdrpn.setBottom(FXMLLoader.load(getClass().getResource("/shopmanagement/Logout.fxml")));
            Top2Controller.backBtnVal = 1;
            LogoutController.logoutBtnVal = 1;

            adminNameField.clear();
            passwordField.clear();
        } else {
            ShowAlert.viewAlert(Alert.AlertType.ERROR, owner, "Input Error", "Invalid User Name or Password");
        }

        adminNameField.clear();
        passwordField.clear();
    }

}
