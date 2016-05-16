/**
 * Created by lstrzalk on 15.05.16.
 */
public class Start {
    private static Menu menu;
    private static OrderDatabase od;
    public static void main(String args[]){
        menu=new Menu();
        menu.showMenu();
        od=new OrderDatabase();
        od.addOrder();
    }
}
