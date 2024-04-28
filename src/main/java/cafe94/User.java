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
        accountActive = true;
        activationDate = LocalDate.now();
        userType = 0;
    }

    public static int getUserID() {
        return userID;
    }

    public static void setUserID(int userID) {
        User.userID = userID;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isAccountActive() {
        return accountActive;
    }

    public void setAccountActive(boolean accountActive) {
        this.accountActive = accountActive;
    }

    public LocalDate getActivationDate() {
        return activationDate;
    }

    public void setActivationDate(LocalDate activationDate) {
        this.activationDate = activationDate;
    }

    public LocalDate getDeactivationDate() {
        return deactivationDate;
    }

    public void setDeactivationDate(LocalDate deactivationDate) {
        this.deactivationDate = deactivationDate;
    }

    public boolean getAccountActive(){
        return accountActive;
    }

    public void setAccountActive(){
        this.accountActive = false;
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

    @Override
    public String toString() {
        return "User{" +
                "userType=" + userType +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", accountActive=" + accountActive +
                ", activationDate=" + activationDate +
                ", deactivationDate=" + deactivationDate +
                '}';
    }
}
