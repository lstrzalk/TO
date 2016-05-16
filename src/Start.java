import java.util.Scanner;

/**
 * Created by lstrzalk on 15.05.16.
 */
public class Start {
    private static Menu menu;
    private static OrderDatabase od;
    public static void main(String args[]){
        menu=new Menu();
        int i=0;
        for (Pizza p:menu.getBestSets()){
            System.out.println(i+ " "+p.show());
            i++;
        }
        Scanner in = new Scanner(System.in);
        System.out.println("Choose[1] one or make your own[0] Pizza");
        int opt=in.nextInt();
        if(opt==0) {
            od = new OrderDatabase();
            if(od.addOrder()){
                System.out.println("success!");
            }
            else {
                System.out.println("fail :(");
            }
        }
        else{
            System.out.println("Choose Pizza");
            System.out.println("You have choosen:\n"+menu.getBestSets().get(in.nextInt()));
        }
    }
}
