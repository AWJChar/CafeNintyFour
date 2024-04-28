package cafe94;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


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
                , passwordInput.getText(), phoneNumberInput.getText());
        userManager.saveUserDetails(user);
    }

    public boolean loadAccount(String userEmail, String userPassword) throws Exception {
        User loginUser = userManager.userLogin(userEmail, userPassword);
        if (loginUser != null) {
            System.out.println(loginUser);
            return true;
        }else {
            return false;
        }
    }
}
