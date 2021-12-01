import java.util.ArrayList;

public class Order {
    private String name;
    private boolean ready;
    private ArrayList<Item> items;

    //constructor
    public Order(){
        name = "Guest";
        items = new ArrayList<Item>();
    }

    //overloaded constructor
    public Order(String name){
        this.name = name;
        items = new ArrayList<Item>();
    }
    
    //methods
    public void addItem(Object Item){
        items.add(Item);
    }

    public String getStatusMessage(boolean ready){
        if(ready = true){
            return "Your order is ready.";
        }
        else{
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    public double getOrderTotal(double[] prices){
        double total = 0;
        for(int i = 0; i <= prices.length-1; i++){
            total += prices[i];
        }
        return total;
    }


    //getter for name
    public String getName(){
        return name;
    }
    //setter for name
    public void setName(String name){
        this.name = name;
    }

    //getter for readiness
    public boolean getReady(){
        return ready;
    }
    //setter for readiness
    public void setReady(){
        this.ready = ready;
    }

    //getter for items
    public ArrayList<Item> getItems(){
        return items;
    }

    public void setItems(){
        this.items = items;
    }
}


