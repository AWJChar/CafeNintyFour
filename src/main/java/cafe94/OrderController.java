package cafe94;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Objects;
import java.util.ResourceBundle;

public class OrderController {

    ArrayList<Dish> orderDishes = new ArrayList<>();
    ArrayList<Dish> allDishes = new ArrayList<>();

    private int orderType;
    private Stage stage;
    private Scene scene;
    private Parent root;

    private String orderDestination;
    private Order order;

    private final String[] tableNumbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};

    public void loadDishes() throws Exception {
        String fileURL = ("src/main/resources/dishes.csv");

        String line = null;

        BufferedReader dishReader = new BufferedReader(new FileReader(fileURL));


        while ((line = dishReader.readLine()) != null) {

            if (line.isEmpty()) {
                continue;
            }

            String[] dishDetails = line.split(",");
            Dish dish = new Dish(Double.parseDouble(dishDetails[0]), dishDetails[1],
                    dishDetails[2], Boolean.parseBoolean(dishDetails[3]));
            allDishes.add(dish);
        }
    }

    public void addToOrder(ActionEvent event) throws Exception {

        loadDishes();

        Button orderButton = (Button) event.getSource();

        switch (orderButton.getId()) {
            case ("spaghetti"):
                for (Dish dish : allDishes) {
                    if (dish.getDishName().equalsIgnoreCase("spaghetti")) {
                        orderDishes.add(dish);
                    }
                }
                break;
            case ("wings"):
                for (Dish dish : allDishes) {
                    if (dish.getDishName().equalsIgnoreCase("chicken wings")) {
                        orderDishes.add(dish);
                    }
                }
                break;
            case ("souvlaki"):
                for (Dish dish : allDishes) {
                    if (dish.getDishName().equalsIgnoreCase("Halloumi Souvlaki")) {
                        orderDishes.add(dish);

                    }
                }
                break;
            case ("chips"):
                for (Dish dish : allDishes) {
                    if (dish.getDishName().equalsIgnoreCase("chips")) {
                        orderDishes.add(dish);
                    }
                }
                break;
            case ("sirloinSteak"):
                for (Dish dish : allDishes) {
                    if (dish.getDishName().equalsIgnoreCase("Sirloin Steak")) {
                        orderDishes.add(dish);
                    }
                }
                break;
            case ("satay"):
                for (Dish dish : allDishes) {
                    if (dish.getDishName().equalsIgnoreCase("Chicken Satay")) {
                        orderDishes.add(dish);
                    }
                }
                break;
            case ("egg"):
                for (Dish dish : allDishes) {
                    if (dish.getDishName().equalsIgnoreCase("Egg")) {
                        orderDishes.add(dish);
                    }
                }
                break;
            case ("lobster"):
                for (Dish dish : allDishes) {
                    if (dish.getDishName().equalsIgnoreCase("Lobster Thing")) {
                        orderDishes.add(dish);
                    }
                }
                break;
            case ("pudding"):
                for (Dish dish : allDishes) {
                    if (dish.getDishName().equalsIgnoreCase("Pudding")) {
                        orderDishes.add(dish);
                    }
                }
                break;
            case ("dust"):
                for (Dish dish : allDishes) {
                    if (dish.getDishName().equalsIgnoreCase("Dust")) {
                        orderDishes.add(dish);
                    }
                }
                break;
        }
        for (Dish dish : orderDishes) {
            System.out.println(dish.getDishName() + " " + dish.getDishPrice() + " " + dish.getDishDetails() + " " + dish.isDishOfDay());

        }
        System.out.println();
        allDishes.clear();
    }

    public void submitOrder(ActionEvent event) throws Exception {
        OrderManager.getCurrentOrder().setOrderDishes(orderDishes);

        if (orderType == 2) {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("make-order.fxml")));
        } else {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("home-page.fxml")));
        }
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        OrderManager.saveOrderDetails();
    }

    public void setOrderDestination(ActionEvent event) throws Exception {
        if (order.getOrderType().equals("EATIN")) {
            orderDestination = "";
        } else if (orderType == 0) {
            orderDestination = "";
        }
    }
}
