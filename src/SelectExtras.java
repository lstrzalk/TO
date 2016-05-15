import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by lstrzalk on 15.05.16.
 */
public class SelectExtras extends OrderStep {
    private ArrayList<Extras> extras;
    private ArrayList<Extras> extrases;

    public ArrayList<Extras> getExtrases() {
        return extrases;
    }

    public SelectExtras() {
        extras=new ArrayList<Extras>();
        extras.add(new Extras(2,"Pepperoni"));
        extras.add(new Extras(2,"cheese"));
        extras.add(new Extras(2,"Ham"));
        extras.add(new Extras(2,"Mushrooms"));
        System.out.println("Select extras");
        int i=0;
        for(Extras e:extras){
            System.out.println(i+" extras: "+e.getExtr()+" price: "+e.getPrice());
            i++;
        }
        int temp=-1;
        while (temp>-1){
            temp=in.nextInt();
            if(temp>-1){
                extrases.add(extras.get(temp));

            }
        }
        getExtrases();

    }

}
