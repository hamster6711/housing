package housing;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import exceptions.InvalidUtilityException;

public class Driver implements Serializable {

    public ArrayList<HousingPost> searchPostByCost(int lowerBound,
			int upperBound) {
		Collection<HousingPost> housingList = PostManager.posts.values();
		ArrayList<HousingPost> returnList = new ArrayList<>();
		for (HousingPost post : housingList) {
			double price = post.getPrice();
			if (price >= lowerBound && price <= upperBound) {
				returnList.add(post);
			}
		}
		return returnList;
	}

    // TODO
    public ArrayList<HousingPost> searchPostByRoomType(String roomType){    
    	return null;
    }
    
	// TODO
	public ArrayList<HousingPost> searchPostByDistance(int lowerBound,
			int upperBound) {
		return null;
	}

	public static ArrayList<HousingPost> searchPostByUtilities(String utility) throws InvalidUtilityException {
		Collection<HousingPost> housingList = PostManager.posts.values();
		ArrayList<HousingPost> returnList = new ArrayList<>();
		for (HousingPost post : housingList) {
			String value = post.getUtilities().getUtility(utility);
			if (value == "yes") {
				returnList.add(post);
			}
		}
		return returnList;
	}

}