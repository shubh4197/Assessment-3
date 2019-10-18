
public class StockModule {
int code;
String name;
float price;
int quantity;
public StockModule(int code, String name, float price,int quantity) {
	super();
	this.code = code;
	this.name = name;
	this.price = price;
	this.quantity=quantity;
}
public int getCode() {
	return code;
}
public void setCode(int code) {
	this.code = code;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
@Override
public String toString() {
	return "StockModule [code=" + code + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
}


}
