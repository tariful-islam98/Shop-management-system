package shopmanagement;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class SalaryInfoController implements Initializable {

    @FXML
    private TableView<?> empSalaryTable;
    @FXML
    private TableColumn<?, ?> nameCol;
    @FXML
    private TableColumn<?, ?> salaryCol;
    @FXML
    private TableColumn<?, ?> paidSalaryCol;
    @FXML
    private TableColumn<?, ?> monthCol;
    @FXML
    private TableColumn<?, ?> yearCol;
    @FXML
    private TableColumn<?, ?> dueCol;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Top2Controller.backBtnVal = "UserAccount.fxml";

    }

}
