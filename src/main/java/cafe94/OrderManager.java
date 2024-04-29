package cafe94;

import java.io.*;

public class OrderManager {

    private static Order ORDER;

    public static void createNewOrder(){
        ORDER = new Order();
    }

    public static Order getCurrentOrder() {
        if (ORDER == null) {
            createNewOrder();
        }
        return ORDER;
    }

    public static void saveOrderDetails() throws IOException {

        File userFile = new File("C:\\Users\\Alexander\\Projects\\CafeNintyFour\\src\\main\\resources\\orders.csv");

        FileWriter userOut = new FileWriter(userFile, true);

        BufferedWriter bw = new BufferedWriter(userOut);

        userOut.write(getCurrentOrder().getOrderDishes()+","+ String.valueOf(getCurrentOrder().calculatePrice())+"," +getCurrentOrder().getOrderType()+","+ String.valueOf(getCurrentOrder().getStatus()));

        bw.newLine();
        bw.close();
    }

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
