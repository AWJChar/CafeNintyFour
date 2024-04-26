package cafe94;

public class dishes {
    private double dishPrice;
    private int dishID;
    private String dishName;
    private String dishDetails;
    private boolean dishOfDay;

    public dishes (double price, String name, String details, boolean dishOfDay){

        this.dishPrice = price;
        this.dishName = name;
        this.dishDetails = details;
        this.dishOfDay = dishOfDay;
        dishID++;

    }

    public double getDishPrice(){
        return dishPrice;
    }

    public int getDishID(){
        return dishID;
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
