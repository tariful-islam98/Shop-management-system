package shopmanagement;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

public class HomePageController implements Initializable {

    @FXML
    private BorderPane homePane;
    
    public static BorderPane bdrpn;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            Parent pane = FXMLLoader.load(getClass().getResource("LoginOptions.fxml"));
            homePane.setCenter(pane);
            homePane.setBottom(null);
            
            this.bdrpn = homePane;
        } catch (IOException ex) {
            Logger.getLogger(HomePageController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
