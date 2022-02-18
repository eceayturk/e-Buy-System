
public class Product{
    private int id;
    private static int lastId = 1;
    private String name;
    private double price;
    
    public Product(String name_,double price_){
        this.name = name_;
        this.price = price_; 
        id = lastId++;
    }
    
    public int getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
 
}
