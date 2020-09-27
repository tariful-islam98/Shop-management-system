package shopmanagement;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;

public class Top3Controller implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void backButtonAction(MouseEvent event) throws IOException {
        HomePageController.bdrpn.setCenter(FXMLLoader.load(getClass().getResource("LoginOptions.fxml")));
        HomePageController.bdrpn.setTop(FXMLLoader.load(getClass().getResource("Top1.fxml")));
    }

}
