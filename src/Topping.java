/**
 * Created by lstrzalk on 15.05.16.
 */
public class Topping implements Ingredient {
    private float price;
    private String topp;

    public Topping(float price, String topp) {
        this.price = price;
        this.topp = topp;
    }

    public String  getTopp() {

        return topp;
    }

    public float getPrice() {
        return price;
    }
}
