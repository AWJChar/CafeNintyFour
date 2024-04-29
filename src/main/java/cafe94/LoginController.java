package cafe94;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
//import javafx.scene.control.PasswordField;
//import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class LoginController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    private AccountsController accountsController = new AccountsController();

    private ArrayList<User> Users = new ArrayList<>();

    @FXML
    private TextField usernameInput;

    @FXML
    private PasswordField passwordInput;

    @FXML
    protected void onHelloButtonClick() {

    }

    public void switchToCreateAccount(ActionEvent event) throws IOException {

        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("create-account.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
    }

    public void switchToGuestHome(ActionEvent event) throws Exception {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("guest-home-page.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
    }

    public void switchToHome(ActionEvent event) throws Exception {

        String username = usernameInput.getText();
        String password = passwordInput.getText();

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