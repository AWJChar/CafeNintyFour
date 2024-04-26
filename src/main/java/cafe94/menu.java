package cafe94;
import java.util.ArrayList;
public class menu {

    private ArrayList<dishes> menuItems = new ArrayList<>();
    private String menuName;
    private dishes dishOfDay;

    public menu(String menuName){
        this.menuName = menuName;
    }

    public void appendToMenu(dishes dish){
        menuItems.add(dish);
    }

    public void menuToString(){
        for (dishes dish:menuItems){
            System.out.println(dish.getDishName()+" "+dish.getDishPrice()+" "+dish.getDishID());
        }
    }

    public void removeFromMenu (dishes dish){
        menuItems.remove(dish);
    }
}
