package cafe94;

public class order {
    private static int orderID = 0;
    private dishes orderDishes[];
    private double price;
    private boolean status;
    private final int orderType;

    public order (dishes[] dishObj, int orderType){
        orderID = orderID++;
        this.orderDishes = dishObj;
        status = false;
        this.orderType = orderType;
    }

    public void setStatus(boolean statusUpdate){
        status = statusUpdate;
    }

    public int getOrderID(){
        return orderID;
    }

    public int getOrderType() {
        return orderType;
    }

    public void calculatePrice(){
        for (dishes dish:orderDishes) {
            price = price + dish.getDishPrice();
        }
    }
}
