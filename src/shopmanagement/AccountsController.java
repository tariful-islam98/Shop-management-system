package shopmanagement;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class AccountsController implements Initializable {

    @FXML
    private TableView<?> accountsTable;
    @FXML
    private TableColumn<?, ?> invoiceCol;
    @FXML
    private TableColumn<?, ?> itemCol;
    @FXML
    private TableColumn<?, ?> priceCol;
    @FXML
    private TableColumn<?, ?> contactCol;
    @FXML
    private TableColumn<?, ?> dateCol;
    @FXML
    private TableColumn<?, ?> statusCol;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
       // Top2Controller.backBtnVal = "Otions.fxml";
    }

}
