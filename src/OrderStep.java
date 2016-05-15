import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by lstrzalk on 15.05.16.
 */
public class OrderStep {
    private ArrayList<OrderStep> stepsOrder;
    Scanner in = new Scanner(System.in);
    Pizza pizza;

    public OrderStep() {
        this.stepsOrder.add(new SelectSize());
        this.stepsOrder.add(new SelectDough());
        this.stepsOrder.add(new SelectToppings());
        this.stepsOrder.add(new SelectExtras());
    }

}
