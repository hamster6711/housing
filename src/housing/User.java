package housing;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {

	private static final long serialVersionUID = -8090597420377534554L;

	private String userName;
	private String password;
	private String email;
	private ArrayList<HousingPost> interested = new ArrayList<>();
	private ArrayList<HousingPost> posted = new ArrayList<>();

	/**
	 * @param userName
	 * @param password
	 * @param email
	 */
	public User(String userName, String password, String email) {
		super();
		this.userName = userName;
		this.password = password;
		this.email = email;
	}

	/**
	 * @param userName
	 *            the user name to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return the interested
	 */
	public ArrayList<HousingPost> getInterested() {
		return interested;
	}

	/**
	 * @return the posted
	 */
	public ArrayList<HousingPost> getPosted() {
		return posted;
	}

	public void addInterested(HousingPost interested) {
		this.interested.add(interested);
	}

	public void removeInterested(HousingPost notInterested) {
		this.interested.remove(notInterested);
	}

	public void creatwPost(String ownership, String houseType, String floor, String roomType,
			double price, String availableDate, String location, String minimumStay, Utility utilities,
			ArrayList<String> policies, User user) {
		HousingPost newPost = new HousingPost(ownership, houseType, floor, roomType,
				price, availableDate, location, minimumStay, utilities,
				policies, user);
		this.interested.add(newPost);
	}

	public void deletePost(HousingPost post) {
		this.posted.remove(post);
		PostManager.posts.remove(post);
	}
}
