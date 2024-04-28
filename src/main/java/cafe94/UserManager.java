package cafe94;
import java.io.*;
import java.util.Arrays;

public class UserManager {

    public void saveUserDetails(User user) throws IOException {

        File userFile = new File("C:\\Users\\Alexander\\Projects\\CafeNintyFour\\src\\main\\resources\\users.csv");

        FileWriter userOut = new FileWriter(userFile, true);

        BufferedWriter bw = new BufferedWriter(userOut);

        userOut.write(user.getFirstName()+","+user.getLastName()+","+user.getPassword()+","+user.getAddress()+","
                +user.getEmailAddress()+","+user.getPhoneNumber()+","+user.getAccountActive()+","
                +user.getActivationDate()+","+user.getDeactivationDate()+","+user.getUserType());

        bw.newLine();
        bw.close();
    }

    public User userLogin(String loginUserEmail, String loginUserPassword) throws IOException {
        String fileURL = ("src/main/resources/users.csv");

        String line = null;

        BufferedReader userReader = new BufferedReader(new FileReader(fileURL));


            while ((line = userReader.readLine()) != null) {

                if (line.isEmpty()) {
                    continue;
                }

                String[] userDetails = line.split(",");

                if (userDetails[4].equals(loginUserEmail) && userDetails[2].equals(loginUserPassword)) {

                    return new User(userDetails[0],userDetails[1],userDetails[3],userDetails[4],userDetails[2],userDetails[6]);
                }
            }
            return null;
    }
}

