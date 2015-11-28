package housing;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {

	private static final long serialVersionUID = -8090597420377534554L;

	private String userName;
	private String password;
	private String email;
	private ArrayList<HousingPost> interested = new ArrayList<HousingPost>();
	private ArrayList<HousingPost> posted = new ArrayList<HousingPost>();

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
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
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
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
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

	public void deletePost(HousingPost post) {
		this.posted.remove(post);
	}
}
