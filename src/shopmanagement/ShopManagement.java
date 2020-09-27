package shopmanagement;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ShopManagement extends Application {

    static Stage homeStage;

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();

        this.homeStage = stage;
    }

    public static void main(String[] args) {
        launch(args);
    }

}
