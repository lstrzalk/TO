import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by lstrzalk on 15.05.16.
 */
public class SelectSize extends OrderStep {
    private Size size;
    Scanner in;
    private ArrayList<Size> sizes;
    public SelectSize(Scanner in) {
        this.in=in;
        sizes=new ArrayList<Size>();
        sizes.add(new Size(10,15));
        sizes.add(new Size(12,20));
        sizes.add(new Size(14,25));
        sizes.add(new Size(16,30));
        sizes.add(new Size(18,40));
        setSize();
    }

    public ArrayList<Size> getSizes() {
        return sizes;
    }

    public void setSize() {
        System.out.println("Select pizzas dim");
        int i=0;
        for(Size s:sizes){
            System.out.println(i+" "+s.showWithPrice());
            i++;
        }
        int choose;
        do{
            choose=in.nextInt();
            size=sizes.get(choose);
            System.out.println(summarize());
        }while (!validateData());
    }

    public Size getFields() {
        return size;
    }
    public String summarize(){
        return size.showWithPrice();
    }
    public boolean validateData(){
        System.out.println("Are you sure?");
        return in.nextBoolean();
    }
}
