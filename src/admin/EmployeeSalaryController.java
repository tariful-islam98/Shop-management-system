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
import javafx.scene.control.TextField;
import shopmanagement.HomePageController;
import shopmanagement.Top2Controller;

public class EmployeeSalaryController implements Initializable {

    @FXML
    private TextField empNameField;
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
        //Top2Controller.backBtnVal = "AdminOtions.fxml";
    }

    @FXML
    private void enterButtonAction(ActionEvent event) {
    }

    @FXML
    private void updateButtonAction(ActionEvent event) throws IOException {
        HomePageController.bdrpn.setCenter(FXMLLoader.load(getClass().getResource("UpdateSalary.fxml")));
    }

}
