package cafe94;

import java.io.*;

/**
 * Order manager class controls the saving and loading of orders to and from csv.
 * @author Alexander Charlesworth
 * @version 0.1.1
 */
public class OrderManager {

    private static Order ORDER;

    /**
     * creates blank order which later gets filled by setters
     */
    public static void createNewOrder(){
        ORDER = new Order();
    }

    /**
     * returns the current order obj or creates a new one.
     * @return Order
     */
    public static Order getCurrentOrder() {
        if (ORDER == null) {
            createNewOrder();
        }
        return ORDER;
    }

    /**
     * Saves order details to csv file.
     * @throws IOException
     */
    public static void saveOrderDetails() throws IOException {

        File userFile = new File("C:\\Users\\Alexander\\Projects\\CafeNintyFour\\src\\main\\resources\\orders.csv");

        FileWriter userOut = new FileWriter(userFile, true);

        BufferedWriter bw = new BufferedWriter(userOut);

        userOut.write(getCurrentOrder().getOrderDishes()+","+ String.valueOf(getCurrentOrder().calculatePrice())+"," +getCurrentOrder().getOrderType()+","+ String.valueOf(getCurrentOrder().getStatus()));

        bw.newLine();
        bw.close();
    }

    /**
     * loads orders from csv file
     * @throws Exception
     */
    public static void loadOrders() throws Exception {
        String fileURL = ("src/main/resources/users.csv");

        String line = null;

        BufferedReader userReader = new BufferedReader(new FileReader(fileURL));


        while ((line = userReader.readLine()) != null) {

            if (line.isEmpty()) {
                    continue;
            }
            String[] orderDetails = line.split(",");
            Order order = new Order();
        }
    }
}
