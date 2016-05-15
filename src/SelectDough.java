import java.util.AbstractList;
import java.util.ArrayList;

/**
 * Created by lstrzalk on 15.05.16.
 */
public class SelectDough extends OrderStep {
    private Dough dough;
    private AbstractList<Dough> doughs;

    public Dough getDough() {
        return dough;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public SelectDough() {
        doughs=new ArrayList<Dough>();
        doughs.add(new Dough(2,true));
        doughs.add(new Dough(4,false));
        System.out.println("Select pizzas dough");
        int i=0;
        for(Dough d:doughs){
            System.out.println(i+" dough: "+ (d.isThin()==true?" thin ":"fluffy")+" price: "+d.getPrice());
            i++;
        }
        setDough(in.nextInt() == 0 ? doughs.get(0):doughs.get(1));
    }

}
