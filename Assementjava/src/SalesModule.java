import java.util.*;
public class SalesModule {
    Scanner s;
    List<StockModule> cart;
    int quantity=0;
   
    float sum;
    public SalesModule() {
		super();
		this.s = new Scanner(System.in);
		this.cart=new ArrayList<>();
		
		this.sum=(float) 0.0;
	}
    
    public void cart(StockManager g) throws Validation{
		System.out.println("Enter the code:");
		int code=s.nextInt();
		System.out.println("Enter the quantity:");
		int quantity=s.nextInt();
	    float unitprice=0;
	    
		for(StockModule i:g.af) {
			
			if(i.code==code) {
				
				if(quantity>i.quantity) {
					throw new Validation("Not in stock");
				}
				cart.add(i);
				this.quantity=quantity;
				unitprice=i.price*this.quantity;
				sum=sum+unitprice;
			}
		}
	}
    
    public void generatebill() {
    	for(StockModule i:cart) {
    		System.out.println("Product name:"+i.name);
    	}
    	System.out.println("Total:"+sum);
    }
}
