package housing;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class HousingPost implements Serializable {

	private static final long serialVersionUID = 8898168764390521282L;
	
	private static int count = 0;
	private int instanceID = 0;
	private String ownership;
	private String houseType;
	private String roomType;
	private double price;
	private String availableDate;
	private String location;
	private String minimumStay;
	private HashMap<String, String> utilities = new HashMap<String, String>();
	private ArrayList<String> policies = new ArrayList<String>();

	/**
	 * @param ownership
	 * @param houseType
	 * @param roomType
	 * @param price
	 * @param availableDate
	 * @param location
	 * @param minimumStay
	 * @param utilities
	 * @param policies
	 */
	public HousingPost(String ownership, String houseType, String roomType, double price, String availableDate, String location,
			String minimumStay, HashMap<String, String> utilities, ArrayList<String> policies) {
		super();
		this.ownership = ownership;
		this.houseType = houseType;
		this.roomType = roomType;
		this.price = price;
		this.availableDate = availableDate;
		this.location = location;
		this.minimumStay = minimumStay;
		this.utilities = utilities;
		this.policies = policies;		
		this.instanceID = count;
        count++;
	}

	/**
	 * @return the instanceID
	 */
	public int getInstanceID() {
		return instanceID;
	}
	
	/**
	 * @return the ownership
	 */
	public String getOwnership() {
		return ownership;
	}

	/**
	 * @param ownership
	 *            the ownership to set
	 */
	public void setOwnership(String ownership) {
		this.ownership = ownership;
	}

	/**
	 * @return the houseType
	 */
	public String getHouseType() {
		return houseType;
	}

	/**
	 * @param houseType
	 *            the houseType to set
	 */
	public void setHouseType(String houseType) {
		this.houseType = houseType;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the availableDate
	 */
	public String getAvailableDate() {
		return availableDate;
	}

	/**
	 * @param availableDate
	 *            the availableDate to set
	 */
	public void setAvailableDate(String availableDate) {
		this.availableDate = availableDate;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location
	 *            the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	public HashMap<String, String> getUtilities() {
		return utilities;
	}

	public void setUtilities(HashMap<String, String> utilities) {
		this.utilities = utilities;
	}

	public ArrayList<String> getPolicies() {
		return policies;
	}

	public void setPolicies(ArrayList<String> policies) {
		this.policies = policies;
	}

	public String getMinimumStay() {
		return minimumStay;
	}

	public void setMinimumStay(String minimumStay) {
		this.minimumStay = minimumStay;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
}
