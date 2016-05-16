import java.util.ArrayList;

/**
 * Created by lstrzalk on 16.05.16.
 */
public class Extrases implements Ingredient {
    private ArrayList<Extras> extrases;

    public Extrases() {
        this.extrases = new ArrayList<Extras>();
    }

    @Override
    public float getPrice() {
        float price=0;
        for(Extras e:extrases){
            price+=e.getPrice();
        }
        return price;
    }

    @Override
    public String show() {
        String buff="Extrases ";
        for (Extras e:extrases){
            buff+=e.getExtr()+" ";
        }
        return buff;
    }
    public String showWithPrice(){
        String buff="";
        int i=0;
        for (Extras e:extrases){
            buff+=i+" "+e.getExtr()+" Price: "+e.getPrice()+"\n";
            i++;
        }
        return buff;
    }
    public void add(Extras e){
        extrases.add(e);
    }
    public Extras getExtras(int index){
        return extrases.get(index);
    }
}
