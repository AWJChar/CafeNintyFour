package cafe94;
import java.util.ArrayList;

public class Order {
    private static int orderID = 0;

    public static void setOrderID(int orderID) {
        Order.orderID = orderID;
    }

    public void setOrderDishes(ArrayList<Dish> orderDishes) {
        this.orderDishes = orderDishes;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    public String getOrderDestination() {
        return orderDestination;
    }

    public String getOrderDestinationString() {
        return orderDestinationString;
    }

    public void setOrderDestinationString(String orderDestinationString) {
        this.orderDestinationString = orderDestinationString;
    }

    private ArrayList<Dish> orderDishes = new ArrayList<>();
    private double price;
    private boolean status = false;
    private OrderType orderType;

    private String orderDestination;
    private String orderDestinationString;

    public Order() {

    }


    public void setStatus(boolean statusUpdate){
        status = statusUpdate;
    }

    public boolean getStatus() {
        return status;
    }

    public void setOrderDestination(String orderDestination) {
        this.orderDestination = orderDestination;
    }

    public int getOrderID(){
        return orderID;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public double calculatePrice(){
        for (Dish dish:orderDishes) {
            price = price + dish.getDishPrice();
        }
        return price;
    }

    public String getOrderDishes() {
        String orderDetails = "[";
        for (Dish dishes: orderDishes) {
            orderDetails = orderDetails + dishes.getDishName() + " ";
        }
        orderDetails = orderDetails + "]";

        return orderDetails;
    }
}
