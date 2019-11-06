//David Jacoby
//19 September 2018
//Class defined for exception handling
//when the user enters a number less than 
//or equal to zero

public class LessThanOrEqualToZeroException extends Exception {
	
	public  LessThanOrEqualToZeroException() {
			super("You must enter an integer greater than 0.");
	}

	
	public LessThanOrEqualToZeroException(String message) {
		super("\n***** " + message + " is not a positive integer greater than zero.");
	}
}
