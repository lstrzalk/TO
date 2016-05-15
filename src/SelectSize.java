import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by lstrzalk on 15.05.16.
 */
public class SelectSize extends OrderStep {
    private Size size;
    private ArrayList<Size> sizes;
    public SelectSize() {
        sizes=new ArrayList<Size>();
        sizes.add(new Size(10,15));
        sizes.add(new Size(12,20));
        sizes.add(new Size(14,25));
        sizes.add(new Size(16,30));
        sizes.add(new Size(18,40));
        setSize();
        getSize();
    }

    public void setSize() {
        System.out.println("Select pizzas dim");
        int i=0;
        for(Size s:sizes){
            System.out.println(i+" dim: "+s.getDim()+" price: "+s.getPrice());
            i++;
        }
        int dim= in.nextInt();
        size=sizes.get(dim);
    }

    public Size getSize() {
        return size;
    }
}
