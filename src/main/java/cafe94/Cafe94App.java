package cafe94;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

/**
 * This class creates the stage which holds the GUI.
 * @author Alexander Charlesworth
 * @version 0.1.1
 */

public class Cafe94App extends Application {

    /**
     * Creates the cafe-94 application stage.
     * @param stage creates stage object.
     * @throws IOException
     */
    @Override
    public void start(Stage stage) throws IOException {

        //Loads root fxml file, sets it as the scene, applies the scene to the stage and shows the stage
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("login-view.fxml")));
        Scene loginScene = new Scene(root);
        stage.setTitle("Cafe-94");
        stage.setScene(loginScene);
        stage.show();
    }

    /**
     * launches application stage.
     * @param args takes no args.
     */
    public static void main(String[] args) {

        launch();
    }
}
