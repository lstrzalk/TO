import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by lstrzalk on 15.05.16.
 */
public class SelectToppings extends OrderStep {
    private ArrayList<Topping> toppings;
    Scanner in;
    Topping topping;
    public ArrayList<Topping> getToppings() {
        return toppings;
    }


    public SelectToppings(Scanner in) {
        this.in=in;
        toppings=new ArrayList<Topping>();
        toppings.add(new Topping(1,"red"));
        toppings.add(new Topping(1,"white"));
        toppings.add(new Topping(1,"green"));
        System.out.println("Select topping");
        int i=0;
        for (Topping t:toppings){
            System.out.println(i+" "+t.showWithPrice());
            i++;
        }
        int choose;
        do{
            choose=in.nextInt();
            topping=toppings.get(choose);
            System.out.println(summarize());
        }while (!validateData());
    }
    public Topping getFields(){
        return topping;
    }
    public String summarize(){
        return topping.showWithPrice();
    }
    public boolean validateData(){
        System.out.println("Are you sure?");
        return in.nextBoolean();
    }

}
