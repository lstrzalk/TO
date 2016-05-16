import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by lstrzalk on 15.05.16.
 */
public class SelectExtras extends OrderStep {
    private Extrases extras;
    private Extrases choosenExtrases;

    public Extrases getChoosenExtrases() {
        return choosenExtrases;
    }

    public Extrases getExtras() {
        return extras;
    }

    public SelectExtras() {
        this.extras=new Extrases();
        this.choosenExtrases=new Extrases();
        extras.add(new Extras(2,"Pepperoni"));
        extras.add(new Extras(2,"cheese"));
        extras.add(new Extras(2,"Ham"));
        extras.add(new Extras(2,"Mushrooms"));
        System.out.println("Select extras");
        System.out.println(extras.showWithPrice());
        int temp=-1;
        while (temp>-1){
            temp=in.nextInt();
            if(temp>-1){
                choosenExtrases.add(choosenExtrases.getExtras(temp));

            }
        }
    }

}
