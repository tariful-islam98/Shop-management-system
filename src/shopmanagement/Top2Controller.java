package shopmanagement;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Top2Controller implements Initializable {

    @FXML
    private TextField searchField;
    @FXML
    private MenuBar optionsMenu;
    
    public static int backBtnVal=0;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void searchButtonAction(MouseEvent event) {
    }

    @FXML
    private void backButtonAction(MouseEvent event) throws IOException {
        if(backBtnVal==0){
        Parent pane = FXMLLoader.load(getClass().getResource("Options.fxml"));
        HomePageController.bdrpn.setCenter(pane);
        }
        if(backBtnVal==1){
            HomePageController.bdrpn.setCenter(FXMLLoader.load(getClass().getResource("/admin/AdminOptions.fxml")));
        }
    }

    @FXML
    private void adminLoginBtnAction(ActionEvent event) throws IOException {
        HomePageController.bdrpn.setCenter(FXMLLoader.load(getClass().getResource("/admin/AdminLogin.fxml")));
    }

}
