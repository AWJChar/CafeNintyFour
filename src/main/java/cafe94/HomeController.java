package cafe94;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

/**
 * Controls the function of the home page.
 * Directs users to correct pages based on button presses.
 * @author Alexander Charlesworth
 * @version 0.1.1
 */
public class HomeController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    /**
     * Switches to order scenes where user can choose order type and items.
     * @param event button click
     * @throws IOException
     */
    public void switchToMakeOrder(ActionEvent event) throws IOException {

        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("order-type-customer.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);

    }

    /**
     * Switches to booking scene where users can book a table at the restaurant.
     * @param event button click
     * @throws IOException
     */
    public void switchToMakeBooking(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("make-booking.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
    }
}
