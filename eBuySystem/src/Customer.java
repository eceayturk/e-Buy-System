
public class Customer extends Basket{
    private String username;
    private String password;
    private Basket myBasket = new Basket();
    
    public Customer(String username_, String password_){
        username = username_;
        password = password_;
    }
    
    public Basket getMyBasket(){
        return myBasket;
    }
    
    public String getPassword(){
        return password;
    }
    
    public String getUsername(){
        return username;
    }
    
    
}
