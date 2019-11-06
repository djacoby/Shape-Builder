//David Jacoby
//19 September 2018
//Class defined for exception handling
//when the user enters a number less 
//than zero

public class LessThanZeroException extends Exception {
	
	public  LessThanZeroException() {
		super("You must enter an integer greater than 0.");
}


public LessThanZeroException(String message) {
	super("\n***** " + message + " is not an integer greater to zero");
}
}
