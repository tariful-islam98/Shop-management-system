package admin;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import shopmanagement.HomePageController;
import shopmanagement.Top2Controller;

public class EmployeeController implements Initializable {

    @FXML
    private TableView<?> employeeTable;
    @FXML
    private TableColumn<?, ?> nameCol;
    @FXML
    private TableColumn<?, ?> addressCol;
    @FXML
    private TableColumn<?, ?> contactCol;
    @FXML
    private TableColumn<?, ?> salaryCol;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Top2Controller.backBtnVal = "AdminOtions.fxml";
    }

    @FXML
    private void customizeBtnAction(ActionEvent event) throws IOException {
        HomePageController.bdrpn.setCenter(FXMLLoader.load(getClass().getResource("EditEmployee.fxml")));
    }

}
