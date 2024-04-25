package cafe94;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
public class HomeController {
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    protected void onHelloButtonClick() {
        System.out.println("Hello from the home page");
    }
}
