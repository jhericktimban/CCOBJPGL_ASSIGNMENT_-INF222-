import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class App extends Application {

    public static void main(String[] args) {

        launch(args);
    }

    public void start(Stage Stage) throws Exception {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("/view/Drink.fxml"));
            Scene scene = new Scene(root);
            Stage.setScene(scene);
            Stage.show();
            

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}