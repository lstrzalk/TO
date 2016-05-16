import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by lstrzalk on 15.05.16.
 */
public class OrderDatabase {
    ArrayList<Pizza> orders;
    ArrayList<OrderStep> order;
    Pizza pizza;
    ArrayList<Ingredient> ingredients;
    public OrderDatabase() {
        ingredients=new ArrayList<Ingredient>();
        this.order=new ArrayList<OrderStep>();
        this.orders = new ArrayList<Pizza>();
    }

    boolean addOrder(Pizza p){
        Scanner in = new Scanner(System.in);
        order.add(new SelectSize(in));
        order.add(new SelectDough(in));
        order.add(new SelectExtras(in));
        order.add(new SelectToppings(in));
        for (OrderStep o:order){
            ingredients.add(o.getFields());
        }
        System.out.println("Are you sure?[0:1]");
        if(in.nextBoolean()) {
            pizza = new Pizza(ingredients);
            return true;
        }
        else
            return false;
    }

}
