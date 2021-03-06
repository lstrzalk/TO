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

    boolean addOrder(){
        Scanner in = new Scanner(System.in);
        order.add(new SelectSize(in));
        order.add(new SelectDough(in));
        order.add(new SelectExtras(in));
        order.add(new SelectToppings(in));
        for (OrderStep o:order){
            ingredients.add(o.getFields());
            System.out.println(o.summarize());
        }
        pizza = new Pizza(ingredients);
        System.out.println(pizza.show());
        System.out.println("Are you sure?");
        if(in.nextBoolean()) {
            orders.add(pizza);
            return true;
        }
        else{
            return false;
        }
    }

}
