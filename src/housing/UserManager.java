package housing;

import java.io.Serializable;
import java.util.HashMap;

public class UserManager implements Serializable{

	private static final long serialVersionUID = 6739965072438117914L;
	
	public static HashMap<String, User> users = new HashMap<>();
	
	public static void addUser(User newUser){
		users.put(newUser.getEmail(), newUser);
	}

	public User getUserFromEmail(String email){
		return users.get(email);
	
	}
}
