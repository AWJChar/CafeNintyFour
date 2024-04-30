package cafe94;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
//import javafx.scene.control.PasswordField;
//import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Controls the function of the log in stage and routes users to the correct subsequent
 * page based on GUI input. Separates accounts destination scenes based on account type.
 * @author Alexander Charlesworth
 * @version 0.1.1
 */
public class LoginController {

    public Button createAccountPage;
    private Stage stage;
    private Scene scene;
    private Parent root;

    private AccountsController accountsController = new AccountsController();


    @FXML
    private TextField usernameInput;

    @FXML
    private PasswordField passwordInput;

    /**
     * Switches the scene to account creation.
     * @param event button click.
     * @throws Exception
     */
    public void switchToCreateAccount(ActionEvent event) throws Exception {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("create-account.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
    }

    /**
     * Switches the scene to guest user home page.
     * @param event button click.
     * @throws Exception
     */
    public void switchToGuestHome(ActionEvent event) throws Exception {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("guest-home-page.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
    }

    /**
     * Switches the scene to different home page based on account type.
     * @param event button click.
     * @throws Exception
     */
    public void switchToHome(ActionEvent event) throws Exception {

        //Takes user input from text fields
        String username = usernameInput.getText();
        String password = passwordInput.getText();

        //Compares account type and routes to correct destination scene
        if (accountsController.loadAccount(username, password) == 0) {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("home-page.fxml")));

        } else if (accountsController.loadAccount(username, password) == 1){

            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("staff-home-page.fxml")));

        } else if (accountsController.loadAccount(username, password) == 2){

            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("admin-home-page.fxml")));
        }
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
    }

}