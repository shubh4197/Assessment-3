import java.util.*;
import java.lang.*;


public class StockManager {
   List<StockModule> af;
   Scanner s;
public StockManager() {
	super();
	this.af = new ArrayList<>();
	this.s=new Scanner(System.in);
}

public void add() {
	
	int code=0;
	Boolean isValid=true;
	do {
	try {
	System.out.println("Code:");
	code=s.nextInt();
	checkCode(code);
	isValid=true;
	}catch(Validation ex) {
		System.err.println(ex.getMessage());
		isValid=false;
	}}while(isValid==false);
	System.out.println("Product Name:");
	String name=s.next();
	System.out.println("Price:");
    float price=s.nextFloat();
    System.out.println("Quantity:");
    int quantity=s.nextInt();
    StockModule s1=new StockModule(code,name,price,quantity);
	af.add(s1);
}
   
public void printall() {
	for(StockModule s:af) {
		System.out.println(s);
	}
}

public void update() {
	System.out.println("Enter the code of the product you want to update");
	int code=s.nextInt();
	for(StockModule i:af) {
		if(i.code==code) {
			System.out.println("What do you want to update(Please Choose)");
			System.out.println("1.Product name");
			System.out.println("2.Price");
			System.out.println("3.Quantity");
			int option=s.nextInt();
			switch(option) {
			case 1:
				System.out.println("Product name:");
				String name=s.next();
				i.name=name;
				break;
			case 2:
				System.out.println("Price:");
				float price=s.nextFloat();
				i.price=price;
				break;
			case 3:
				System.out.println("Quantity:");
				int quantity=s.nextInt();
				i.quantity=quantity;
				break;
				default:
			System.out.println("Cant update");
			}
		}
	}
}

public void checkCode(int value) throws Validation{
	int i=0;
	while(value!=0) {
		value=value/10;
		i++;
		}
	if(i!=3) {
		throw new Validation("Please enter a valid 3 digit code");
	}
}
}
