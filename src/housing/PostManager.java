package housing;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class PostManager implements Serializable {

	private static final long serialVersionUID = -4257040196475824752L;

	protected static HashMap<Integer, HousingPost> posts = new HashMap<>();

	public static void addPost(String ownership, String houseType, String roomType, String floor, double price, String availableDate, String location,
			String minimumStay, Utility utilities, ArrayList<String> policies, User user) {
		HousingPost newPost = new HousingPost(ownership, houseType, floor, roomType,
				price, availableDate, location, minimumStay, utilities,
				policies, user);
		posts.put(newPost.getInstanceID(), newPost);
	}

	public static void deletePost(HousingPost unwantedPost) {
		posts.remove(unwantedPost.getInstanceID(), unwantedPost);
	}
}
