import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by lstrzalk on 15.05.16.
 */
public class SelectExtras extends OrderStep {
    private Extrases extras;
    private Extrases choosenExtrases;
    Scanner in;


    public Extrases getChoosenExtrases() {
        return choosenExtrases;
    }

    public Extrases getExtras() {
        return extras;
    }

    public SelectExtras(Scanner in) {
        this.in = in;
        this.extras=new Extrases();
        this.choosenExtrases=new Extrases();
        extras.add(new Extras(2,"Pepperoni"));
        extras.add(new Extras(2,"cheese"));
        extras.add(new Extras(2,"Ham"));
        extras.add(new Extras(2,"Mushrooms"));
        System.out.println("Select extras");
        System.out.println(extras.showWithPrice());
        int temp;
        do{
            temp=-1;
            System.out.println("Adding loop: Type -1 to exit loop");
                do{
                temp=in.nextInt();
                if(temp>-1){
                    choosenExtrases.add(extras.getExtras(temp));
                }
            }while (temp>-1);
            System.out.println(summarize());
            System.out.println("Removin loop: Type -1 to exit loop");
                do{
                temp=in.nextInt();
                if(temp>-1){
                    choosenExtrases.remove(temp);
                }
            }while (temp>-1);
            System.out.println(summarize());
        }while (!validateData());
    }
    public Extrases getFields() {
        return choosenExtrases;
    }
    public String summarize(){
        return choosenExtrases.showWithPrice();
    }
    public boolean validateData(){
        System.out.println("Are you sure?");
        return in.nextBoolean();
    }

}
