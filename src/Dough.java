/**
 * Created by lstrzalk on 15.05.16.
 */
public class Dough implements Ingredient {
    private float price;
    private boolean thin;

    public Dough(float price, boolean thin) {
        this.price = price;
        this.thin = thin;
    }

    public boolean isThin() {

        return thin;
    }

    public float getPrice() {
        return price;
    }
}
