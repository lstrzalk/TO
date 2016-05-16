import java.util.ArrayList;

/**
 * Created by lstrzalk on 15.05.16.
 */
public class Pizza {
    ArrayList<Ingredient> ingredients;
    private float price;
    public Pizza(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
        this.price=getPrice();
    }

    public float getPrice() {
        int tmp=0;
        for (Ingredient i:ingredients){
            tmp+=i.getPrice();
        }
        return tmp;
    }
    public String show(){
        String buff="";
        for (Ingredient i:ingredients){
            buff+=i.show()+" ";
        }
        buff+=getPrice();
        return buff;
    }
}
