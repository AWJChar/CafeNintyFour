package cafe94;

public class test {

    public static void main(String[] args){
        Dish satay = new Dish(8.40,"chicken satay","Peanut chicken stuff",true );
        Dish spag = new Dish(7.00,"Spaghetti","Pasta",false );
        Dish korma = new Dish(12,"korma","chicken coconut curry",false );
        Dish iceCream = new Dish(5.30,"chocolate ice cream","Bowl of ice cream",false );
        menu firstMenu = new menu("menu1");
        firstMenu.appendToMenu(satay);
        firstMenu.appendToMenu(spag);
        firstMenu.appendToMenu(korma);
        firstMenu.appendToMenu(iceCream);
        firstMenu.menuToString();

    }

}
