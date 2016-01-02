package exceptions;

public class InvalidUtilityException extends Exception{

	private static final long serialVersionUID = 1392945437351152149L;

	public InvalidUtilityException(){
		super("Sorry, the required utility is not contained in the list.");
	}
}
