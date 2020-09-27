package shopmanagement;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeView;

public class ProductsController implements Initializable {

    @FXML
    private TreeView<?> productsTree;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Top2Controller.backBtnVal = "Otions.fxml";
    }

}
