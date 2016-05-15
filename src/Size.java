/**
 * Created by lstrzalk on 15.05.16.
 */
public class Size implements Ingredient {
    private float price;
    private float dim;

    public float getDim() {
        return dim;
    }

    public Size(float price, float dim) {
        this.price = price;
        this.dim = dim;
    }

    public float getPrice() {
        return price;
    }
}
