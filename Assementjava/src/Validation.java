
public class Validation extends Exception{
   String message;

public Validation(String message) {
	super();
	this.message = message;
}

public String getMessage() {
	return message;
}


   
}
