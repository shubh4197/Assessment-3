import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int option = 0;
		 StockManager k=new StockManager();
         SalesModule j=new SalesModule();
	        Scanner s = new Scanner(System.in);

		 
		  do{
	            System.out.println("\nMENU");
	            System.out.println("If stockManager then:");
	            System.out.println("1. New Product");
	            System.out.println("2. Print List of Products in Stock");
	            System.out.println("3. Update Product details in the stock");
	            System.out.println("If clerk then:");
	            System.out.println("4.Add to cart");
	            System.out.println("5 Generate Bill");
	            System.out.println("Option:");
	            option=s.nextInt();
	            switch (option){
                case 1:
                     k.add();  
                    break;
                case 2:
                	k.printall();
                    break;
                case 3:
                	k.update();
                	break;
                	
                case 4:
                	Boolean isValid=true;
                	int flag=0;
                	do {
                	try {
                		j.cart(k);
                		isValid=true;
                		System.out.println("Do you want to add more items in the cart");
                		System.out.println("0.No");
                		System.out.println("1.Yes");
                		flag=s.nextInt();
                	}catch(Validation ex) {
                		System.err.println(ex.getMessage());
                		isValid=false;
                		System.out.println("Add item again");
                	}}while(isValid==false||flag==1);
                	break;
                case 5:
                	j.generatebill();
                	break;
                	
                default:
                	option=8;
                	break;
            }
        }while ( option !=8);	
	

}
	
}
