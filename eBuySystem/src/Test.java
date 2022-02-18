import java.util.Scanner;

public class Test {

    private static int MAX_PRODUCT = 3;
    private static int MAX_CUSTOMER = 3;
    private static int productCount;
    private static int customerCount;
    private static Product[] productList = new Product[MAX_PRODUCT];
    private static Customer[] customerList = new Customer[MAX_CUSTOMER];
    
    public static void main(String[] args) {
        customerList[0] = new Customer("ali", "123");
        customerList[1] = new Customer("veli", "veli234");
        customerList[2] = new Customer("can", "345can");
        
        productList[0] = new Product("Computer", 2358.5);
        productList[1] = new Product("Phone", 1230.55);
        productList[2] = new Product("Television", 3569.2);
        
        Scanner scanStr = new Scanner(System.in);
        Scanner scanInt = new Scanner(System.in);
        Scanner scanChar = new Scanner(System.in);
        
        int index = -1;
        
        do{
            System.out.println("Enter username: ");
            String user = scanStr.nextLine();
            System.out.println("Enter password: ");
            String pass  = scanStr.nextLine();
            
            boolean flag = false;
            
            for( int i = 0; i < customerList.length; i++){
                if(customerList[i].getUsername().equals(user)){
                    flag = true;
                    index = i;
                    break;
                }
            }
            
            if(flag == false){
                System.out.println("Username does not exist!");
            }
            
            else if(flag == true && !(customerList[index].getPassword().equals(pass))){
                System.out.println("Password is incorrect!");
            }
            
            else if(flag == true && customerList[index].getPassword().equals(pass)){
                System.out.println("Welcome "+customerList[index].getUsername());
                break;
            }
            
        }while(true);
        
        char exit_choice;
        int menu_choice;
        
        if(index != -1){
            
            do{
                System.out.println("\nMENU\n"
                +"1. Add Product to MyBasket\n"
                +"2. Remove Product from MyBasket\n"
                +"3. Show MyBasket and Sum");
                
                menu_choice = scanInt.nextInt();
                
                switch (menu_choice){
                    case 1: 
                        showProductList();
                        System.out.println("Enter a product to ADD your Basket: ");
                        int addItem = scanInt.nextInt();
                        System.out.println("Enter the amount: ");
                        int amount = scanInt.nextInt();
                        
                        addItem--;
                        
                        customerList[index].getMyBasket().addToBasket(productList[addItem], amount);
                        break;
                    case 2: 
                        System.out.println("Enter a product to DELETE from your Basket: \n");
                        customerList[index].getMyBasket().showBasketandSum();
                        String name = scanStr.nextLine();
                        customerList[index].getMyBasket().removeFromBasket(name);
                        break;
                    case 3: 
                        customerList[index].getMyBasket().showBasketandSum();
                }
                
              System.out.println("Press (Y) to continue, (N) to Logout"); 
              exit_choice = scanChar.nextLine().charAt(0); 
              
              
            }while(exit_choice != 'N' && exit_choice != 'n');
            
          System.out.println("GOODBYE!");
        }

    }
        public static void showProductList(){ //PRODUCT LIST yazdırmak için benim eklediğim bir fonskiyon
      
        System.out.println("\nPRODUCT LIST\n"
                + "**************");
               
        for (int i = 0; i < productList.length; i++) {
            System.out.println( productList[i].getID()+ ". " + productList[i].getName() 
                    + " " + productList[i].getPrice());
        }
        
        System.out.println();   
        
    }
    
}
