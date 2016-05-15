import java.util.ArrayList;

/**
 * Created by lstrzalk on 15.05.16.
 */
public class SelectToppings extends OrderStep {
    private Topping topping;
    private ArrayList<Topping> toppings;

    public Topping getTopping() {
        return topping;
    }

    public void setTopping(Topping topping) {
        this.topping = topping;
    }

    public SelectToppings() {
        toppings=new ArrayList<Topping>();
        toppings.add(new Topping(1,"red"));
        toppings.add(new Topping(1,"white"));
        toppings.add(new Topping(1,"green"));
        System.out.println("Select topping");
        int i=0;
        for (Topping t:toppings){
            System.out.println(i+" price: "+t.getPrice()+" topping: "+t.getTopp());
            i++;
        }
        setTopping(toppings.get(in.nextInt()));
        getTopping();
    }

}
