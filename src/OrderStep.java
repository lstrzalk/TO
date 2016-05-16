import java.util.ArrayList;

/**
 * Created by lstrzalk on 15.05.16.
 */
public abstract class OrderStep {
    private ArrayList<OrderStep> stepsOrder;
    public abstract Ingredient getFields();
    public abstract boolean validateData();
    public abstract String summarize();/*
    public OrderStep getCurrent(){
        return stepsOrder.get(stepsOrder.indexOf(this));
    }
    public OrderStep getNext(){
        if(stepsOrder.indexOf(this)+1<stepsOrder.size()){
            return stepsOrder.get(stepsOrder.indexOf(this)+1);
        }
        else
            return null;
    }
    public OrderStep getPrev(){
        if(stepsOrder.indexOf(this)-1>=0){
            return stepsOrder.get(stepsOrder.indexOf(this)-1);
        }
        else
            return null;
    }*/

}
