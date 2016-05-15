/**
 * Created by lstrzalk on 15.05.16.
 */
public class Extras implements Ingredient{
    private float price;
    private String extr;

    public Extras(float price, String extr) {
        this.price = price;
        this.extr = extr;
    }

    public String getExtr() {

        return extr;
    }

    public float getPrice() {
        return price;
    }
}
