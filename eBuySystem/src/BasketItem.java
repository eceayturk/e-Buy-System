
public class BasketItem{
    
    private Product prod;
    private int amount;
    
    public BasketItem(Product p, int a){
       this.prod = p;
       this.amount = a;
    }
    
    public Product getProduct(){
        return prod;
        
    }
    public int getAmount(){
        return amount;
    }
}
   