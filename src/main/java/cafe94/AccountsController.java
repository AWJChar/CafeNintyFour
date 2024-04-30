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

import java.util.Objects;

/**
 * Holds functions for creating and loading user accounts.
 * @author Alexander Charlesworth
 * @version 0.1.1
 */
public class AccountsController {

    private UserManager userManager = new UserManager();

    @FXML
    private TextField firstNameInput;
    @FXML
    private TextField lastNameInput;
    @FXML
    private TextField emailInput;
    @FXML
    private TextField phoneNumberInput;
    @FXML
    private PasswordField passwordInput;
    @FXML
    private TextField addressInput;

    private Stage stage;
    private Scene scene;
    private Parent root;


    /**
     * Takes data from account creation fields in account creation page and creates
     * and saves a new User Object. Changes scene back to home page on completion.
     * @param event button clicked in GUI
     * @throws Exception
     */
    public void createAccount(ActionEvent event) throws Exception {

        //creates new User object with input data
        User user = new User(firstNameInput.getText(), lastNameInput.getText(), addressInput.getText(), emailInput.getText()
                , passwordInput.getText(), phoneNumberInput.getText(),0);
        userManager.saveUserDetails(user);

        //Loads the home page
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("home-page.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
    }

    /**
     * Compares input user email and password with stored values and
     * allows login for correct values.
     * @param userEmail user input email.
     * @param userPassword user input password.
     * @return returns user type
     * @throws Exception
     */
    public int loadAccount(String userEmail, String userPassword) throws Exception {

        //Calls userManager to check if account details exist
        User loginUser = userManager.userLogin(userEmail, userPassword);
        if (loginUser != null) {

            //Returns the user type (0 = customer, 1 = staff, 2 = admin)
            if (loginUser.getUserType() == 0) {
                return 0;
            } else if (loginUser.getUserType() == 1) {
                return 1;
            } else if (loginUser.getUserType() == 2) {
                return 2;
            }
        }
        //returns an invalid number
        return 3;
    }
}
