
public class Basket{
    
    private int MAX_PRODUCT = 3;
    private BasketItem[] basket = new BasketItem[MAX_PRODUCT];
    private int productNum = 0;
    private double basketSum = 0.0;
    
    
    
    public boolean addToBasket(Product p, int amount){
             basket[productNum] = new BasketItem(p,amount);
             basketSum += p.getPrice()*amount;
             productNum++;
             return true;  
    }
    
    public boolean removeFromBasket(String name){
        int removeIndex = 0;
      for (int i = 0; i < productNum; i++) 
            if(basket[i].getProduct().getName().equalsIgnoreCase(name))
                removeIndex = i;
       
      basketSum -= basket[removeIndex].getProduct().getPrice() * basket[removeIndex].getAmount();
      basket[removeIndex] = basket[--productNum];
      return false;
    }
    
    public void showBasketandSum(){
        for (int i = 0; i < productNum; i++) {
            
            System.out.println(basket[i].getAmount()+" " +
                    basket[i].getProduct().getName() + " " +
                    (basket[i].getProduct().getPrice() * basket[i].getAmount())  
                    );
      }
      
      System.out.println("Total:  " + basketSum);
    }

}
