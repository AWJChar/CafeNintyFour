package cafe94;
import java.util.ArrayList;
public class menu {

    private ArrayList<Dish> menuItems = new ArrayList<>();
    private String menuName;
    private Dish dishOfDay;

    public menu(String menuName){
        this.menuName = menuName;
    }

    public void appendToMenu(Dish dish){
        menuItems.add(dish);
    }

    public void menuToString(){
        for (Dish dish:menuItems){
            System.out.println(dish.getDishName()+" "+dish.getDishPrice());
        }
    }

    public void removeFromMenu (Dish dish){
        menuItems.remove(dish);
    }
}
