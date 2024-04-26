package cafe94;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class AccountsController {

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

    public void createAccount() throws FileNotFoundException {

        User user = new User(firstNameInput.getText(), lastNameInput.getText(), addressInput.getText(), emailInput.getText()
                , passwordInput.getText(), phoneNumberInput.getText());
        user.saveUserDetails();
    }

}
