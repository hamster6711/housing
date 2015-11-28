package application;

public class UserNotExistsException extends Exception {

	private static final long serialVersionUID = 6499367633742983872L;

    public UserNotExistsException() {
        super("Sorry, the user does not exists.");
    }
}
