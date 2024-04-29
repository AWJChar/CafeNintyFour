package cafe94;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.Objects;


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

    public void createAccount() throws Exception {

        User user = new User(firstNameInput.getText(), lastNameInput.getText(), addressInput.getText(), emailInput.getText()
                , passwordInput.getText(), phoneNumberInput.getText(),0);
        userManager.saveUserDetails(user);

    }

    public int loadAccount(String userEmail, String userPassword) throws Exception {
        User loginUser = userManager.userLogin(userEmail, userPassword);
        if (loginUser != null) {
            System.out.println(loginUser);
            if (loginUser.getUserType() == 0) {
                return 0;
            } else if (loginUser.getUserType() == 1) {
                return 1;
            } else if (loginUser.getUserType() == 2) {
                return 2;
            }
        } else {
            return 3;
        }

        return 3;
    }
}
