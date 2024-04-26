package cafe94;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class Cafe94App extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("login-view.fxml")));
        Scene loginScene = new Scene(root);
        Image icon = new Image("file:icon.png");
        stage.setTitle("Cafe-94");
        stage.getIcons().add(icon);
        stage.setScene(loginScene);
        stage.show();
    }
    public static void main(String[] args) {

        launch();
    }
}
