package shopmanagement;

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

public class LoginPageController implements Initializable {

    @FXML
    private TextField userNameField;
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

        if (userNameField.getText().isEmpty()) {
            ShowAlert.viewAlert(Alert.AlertType.ERROR, owner, "Input Error", "Please enter User Name");
            return;
        }
        if (passwordField.getText().isEmpty()) {
            ShowAlert.viewAlert(Alert.AlertType.ERROR, owner, "Input Error", "Please enter passowrd");
            return;
        }
        String userName = userNameField.getText();
        String password = passwordField.getText();

        DbAction db = new DbAction();
        Connection con = db.getConnection();

        String query = "select * from employee "
                + "where Employee_name = '" + userName + "' and Password = '" + password + "'";
        ResultSet rs = con.createStatement().executeQuery(query);
        if (rs.next()) {
            HomePageController.bdrpn.setCenter(FXMLLoader.load(getClass().getResource("Options.fxml")));
            HomePageController.bdrpn.setBottom(FXMLLoader.load(getClass().getResource("Logout.fxml")));
            HomePageController.bdrpn.setTop(FXMLLoader.load(getClass().getResource("Top2.fxml")));

            userNameField.clear();
            passwordField.clear();
        } else {
            ShowAlert.viewAlert(Alert.AlertType.ERROR, owner, "Input Error", "Invalid User Name or passowrd");
        }
        userNameField.clear();
        passwordField.clear();
    }

}
