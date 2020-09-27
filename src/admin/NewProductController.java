package admin;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import shopmanagement.Top2Controller;

public class NewProductController implements Initializable {

    @FXML
    private TextField productNameField;
    @FXML
    private TextField ppuField;
    @FXML
    private TextField quantityField;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Top2Controller.backBtnVal = "AdminOtions.fxml";
    }

    @FXML
    private void addButtonAction(ActionEvent event) {
    }

}
