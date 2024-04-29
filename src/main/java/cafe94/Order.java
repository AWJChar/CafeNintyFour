package cafe94;
import java.util.ArrayList;

public class Order {
    private static int orderID = 0;
    private ArrayList<Dish> orderDishes = new ArrayList<>();
    private double price;
    private boolean status;
    private final int orderType;

    private String orderDestination;
    private String orderDestinationString;

    public Order(ArrayList<Dish> dishObj, int orderType){
        orderID = orderID++;
        this.orderDishes = dishObj;
        status = false;
        this.orderType = orderType;

        if (orderType == 0){
            orderDestinationString = ("Table Number: "+orderDestination);
        }else if (orderType == 1) {
            orderDestinationString = ("Takeaway Order");
        }else if (orderType == 2){
            orderDestinationString = ("Order Address: "+orderDestination);
        }
    }

    public void setStatus(boolean statusUpdate){
        status = statusUpdate;
    }

    public void setOrderDestination(String orderDestination) {
        this.orderDestination = orderDestination;
    }

    public int getOrderID(){
        return orderID;
    }

    public int getOrderType() {
        return orderType;
    }

    public void calculatePrice(){
        for (Dish dish:orderDishes) {
            price = price + dish.getDishPrice();
        }
        System.out.println(price);
    }
}
