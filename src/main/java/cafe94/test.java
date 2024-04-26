package cafe94;

public class test {

    public static void main(String[] args){
        dishes satay = new dishes(8.40,"chicken satay","Peanut chicken stuff",true );
        dishes spag = new dishes(7.00,"Spaghetti","Pasta",false );
        dishes korma = new dishes(12,"korma","chicken coconut curry",false );
        dishes iceCream = new dishes(5.30,"chocolate ice cream","Bowl of ice cream",false );
        menu firstMenu = new menu("menu1");
        firstMenu.appendToMenu(satay);
        firstMenu.appendToMenu(spag);
        firstMenu.appendToMenu(korma);
        firstMenu.appendToMenu(iceCream);
        firstMenu.menuToString();

    }

}
