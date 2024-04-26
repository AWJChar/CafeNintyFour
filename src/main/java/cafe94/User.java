package cafe94;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;

public class User {
    private static int userID = 0;
    private int userType;
    private String firstName;
    private String lastName;
    private String address;
    private String emailAddress;
    private String password;
    private String phoneNumber;
    private boolean accountActive;
    private LocalDate activationDate;
    private LocalDate deactivationDate;


    public User(String firstName, String lastName, String address,
                String emailAddress, String password, String phoneNumber){
        userID = userID++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.emailAddress = emailAddress;
        this.password = password;
        this.phoneNumber = phoneNumber;
        accountActive= true;
        activationDate = LocalDate.now();
        userType = 0;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deactivate(){
        accountActive = false;
        deactivationDate = LocalDate.now();
    }

    public void saveUserDetails() throws FileNotFoundException {
        File userFile = new File("C:\\Users\\Alexander\\Projects\\CafeNintyFour\\src\\main\\resources\\users.csv");
        PrintWriter userOut = new PrintWriter(userFile);
        userOut.println(firstName+","+lastName+","+password+","+address+","
                +emailAddress+","+phoneNumber+","+accountActive+","
                +activationDate+","+deactivationDate);
        userOut.close();
    }

    /*public static void main(String[] args) {
        User user = new User("A","C","Swansea","email@emailsite","password",1234567);
        try {
            user.saveUserDetails();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }*/
}
