package housing;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class PostManager implements Serializable {

	private static final long serialVersionUID = -4257040196475824752L;

	public static HashMap<Integer, HousingPost> posts = new HashMap<Integer, HousingPost>();

	public static void addPost(String ownership, String houseType,
			String roomType, double price, String availableDate,
			String location, String minimumStay,
			HashMap<String, String> utilities, ArrayList<String> policies) {
		HousingPost newPost = new HousingPost(ownership, houseType, roomType,
				price, availableDate, location, minimumStay, utilities,
				policies);
		posts.put(newPost.getInstanceID(), newPost);
	}

	public static void deletePost(HousingPost unwantedPost) {
		posts.remove(unwantedPost.getInstanceID(), unwantedPost);
	}

	public static ArrayList<HousingPost> Included(String requirement) {
		Collection<HousingPost> housingList = posts.values();
		ArrayList<HousingPost> returnList = new ArrayList<HousingPost>();
		for (HousingPost post : housingList) {
			String value = post.getUtilities().get(requirement);
			if (value == "yes") {
				returnList.add(post);
			}
		}
		return returnList;
	}

	public ArrayList<HousingPost> searchPostByCost(int lowerBound,
			int upperBound) {
		Collection<HousingPost> housingList = posts.values();
		ArrayList<HousingPost> returnList = new ArrayList<HousingPost>();
		for (HousingPost post : housingList) {
			double price = post.getPrice();
			if (price >= lowerBound && price <= upperBound) {
				returnList.add(post);
			}
		}
		return returnList;
	}

	// TODO
	public ArrayList<HousingPost> searchPostByDistance(int lowerBound,
			int upperBound) {
		return null;
	}
}
