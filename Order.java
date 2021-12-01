import java.util.ArrayList;

public class Order {
    private String name;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<Item>();

    //constructor
    public Order(){
        this.name = "Guest";
        this.ready = false;
    }

    //overloaded constructor
    public Order(String name){
        this.name = name;
        this.ready = false;
    }
    
    //methods
    public void addItem(Item item){
        this.items.add(item);
    }

    public String getStatusMessage(){
        if(this.ready == true){
            return "Your order is ready.";
        }
        else{
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    public double getOrderTotal(){
        double total = 0;
        for(Item i: this.items){
            total += i.getPrice();
        }
        return total;
    }

    public void display(){
        System.out.printf("Customer Name: %s\n", this.name);
        for(Item i: this.items){
            System.out.println(i.getName() + " - $" + i.getPrice());
        }
        System.out.println("Total: $" + this.getOrderTotal());
    }


    //getter for name
    public String getName(){
        return this.name;
    }
    //setter for name
    public void setName(String name){
        this.name = name;
    }

    //getter for readiness
    public boolean getReady(){
        return this.ready;
    }
    //setter for readiness
    public void setReady(boolean ready){
        this.ready = ready;
    }

    //getter for items
    public ArrayList<Item> getItems(){
        return items;
    }
    //setter for items
    public void setItems(){
        this.items = items;
    }
}


