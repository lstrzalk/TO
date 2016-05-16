import java.util.ArrayList;

/**
 * Created by lstrzalk on 15.05.16.
 */
public class Menu {
    private ArrayList<Pizza> pizzas;
    public Menu() {
        pizzas=new ArrayList<>();
        Extrases e=new Extrases();
        Extrases e2=new Extrases();
        e.add(new Extras(2,"Pepperoni"));
        e.add(new Extras(2,"Cheese"));
        ArrayList<Ingredient> i =new ArrayList<Ingredient>();
        i.add(new Size(10,15));
        i.add(new Dough(2,true));
        i.add(new Topping(1,"red"));
        i.add(e);
        pizzas.add(new Pizza(i));
        e2.add(new Extras(2,"Ham"));
        e2.add(new Extras(2,"Cheese"));
        e2.add(new Extras(2,"Mushrooms"));
        ArrayList<Ingredient> i2 =new ArrayList<Ingredient>();
        i.add(new Size(14,25));
        i.add(new Dough(2,false));
        i.add(new Topping(1,"green"));
        i.add(e2);
        pizzas.add(new Pizza(i2));
    }

    public ArrayList<Pizza> getBestSets(){
        return pizzas;
    }
    public Pizza getPizza(int index){
        return pizzas.get(index);
    }
}
