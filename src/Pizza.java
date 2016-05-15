import java.util.ArrayList;

/**
 * Created by lstrzalk on 15.05.16.
 */
public class Pizza {
    private float price;
    private Size size;
    private Dough dough;
    private Topping topping;
    private ArrayList<Extras> extrases;
    public Pizza(Size size, Dough dough, Topping topping, ArrayList<Extras> extrases) {
        this.size = size;
        this.dough = dough;
        this.topping = topping;
        this.extrases = extrases;
        this.price=getPrice();
    }

    public float getPrice() {
        price+=dough.getPrice();
        price+=size.getPrice();
        price+=topping.getPrice();
        for (Extras e: extrases){
            e.getPrice();
        }
        return price;
    }
    public String show(){
        String extr="";
        for(Extras e:extrases){
            extr+=e.getExtr()+", ";
        }
        return "Size: "+this.size.getDim()+", Dough: "+(this.dough.isThin()==true?"thin":"fluffy")+", Topping: "+this.topping.getTopp()+", Extras: "+extr+"Price: "+getPrice();
    }
}
