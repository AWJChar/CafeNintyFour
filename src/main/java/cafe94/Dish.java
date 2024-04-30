package cafe94;

/**
 * Dish class holds details of dishes which are available at a restaurant.
 * @author Alexander Charlesworth
 * @version 0.1.1
 */
public class Dish {
    private double dishPrice;
    private String dishName;
    private String dishDetails;
    private boolean dishOfDay;

    /**
     * Dish constructor
     * @param price Dish price
     * @param name Name of dish
     * @param details details of dish
     * @param dishOfDay Is it currently dish of the day?
     */
    public Dish(double price, String name, String details, boolean dishOfDay){

        this.dishPrice = price;
        this.dishName = name;
        this.dishDetails = details;
        this.dishOfDay = dishOfDay;

    }

    public double getDishPrice(){
        return dishPrice;
    }


    public String getDishName(){
        return dishName;
    }

    public String getDishDetails(){
        return dishDetails;
    }

    public boolean isDishOfDay(){
        return dishOfDay;
    }

    public void setDishPrice(double price){
        this.dishPrice = price;
    }

    public void setDishName(String name){
        this.dishName = name;
    }

    public void setDishDetails(String details){
        this.dishDetails = details;
    }

    public void setDishOfDay(boolean dishOfDay){
        this.dishOfDay = dishOfDay;
    }
}
