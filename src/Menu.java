import java.util.ArrayList;

/**
 * Created by lstrzalk on 15.05.16.
 */
public class Menu {
    private ArrayList<Pizza> pizzas;
    public Menu() {
        pizzas=new ArrayList<>();
        ArrayList<Extras>e=new ArrayList<Extras>();
        ArrayList<Extras>e2=new ArrayList<Extras>();
        e.add(new Extras(2,"Pepperoni"));
        e.add(new Extras(2,"Cheese"));
        pizzas.add(new Pizza(new Size(10,15),new Dough(2,true),new Topping(1,"red"),e));
        e2.add(new Extras(2,"Ham"));
        e2.add(new Extras(2,"Cheese"));
        e2.add(new Extras(2,"Mushrooms"));
        pizzas.add(new Pizza(new Size(14,25),new Dough(2,false),new Topping(1,"green"),e2));
    }

    public ArrayList<Pizza> getBestSets(){
        return pizzas;
    }
    public Pizza getPizza(int index){
        return pizzas.get(index);
    }
    public void showMenu(){
        int i=0;
        for(Pizza p:pizzas){
            System.out.println(i+ " "+p.show());
            i++;
        }
    }
}
