import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by lstrzalk on 15.05.16.
 */
public class SelectDough extends OrderStep {
    private Dough dough;
    Scanner in;
    private AbstractList<Dough> doughs;

    public Dough getDough() {
        return dough;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public SelectDough(Scanner in) {
        this.in=in;
        doughs=new ArrayList<Dough>();
        doughs.add(new Dough(2,true));
        doughs.add(new Dough(4,false));
        System.out.println("Select pizzas dough");
        int i=0;
        for(Dough d:doughs){
            System.out.println(i+" "+ d.showWithPrice());
            i++;
        }

        int choose;
        do{
            choose=in.nextInt();
            setDough(choose == 0 ? doughs.get(0):doughs.get(1));
            System.out.println(summarize());
        }while (!validateData());
    }

    public Dough getFields() {
        return dough;
    }
    public String summarize(){
        return dough.showWithPrice();
    }
    public boolean validateData(){
        System.out.println("Are you sure?");
        return in.nextBoolean();
    }

}
