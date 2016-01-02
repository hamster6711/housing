package housing;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import exceptions.InvalidUtilityException;

public class Utility implements Serializable {
	protected HashMap<String, String> content;
	private String internet;
	private String laundry;
	private String heat;
	private String kitchen;
	private String water;
	
	public Utility(){
		content = new HashMap<String, String>();
		content.put(this.internet, null);
		content.put(this.laundry, null);
		content.put(this.heat, null);
		content.put(this.kitchen, null);
		content.put(this.water, null);
	}
	
	public Utility(String internet, String laundry, String heat, String kitchen, String water){
		content = new HashMap<String, String>();
		content.put(this.internet, internet);
		content.put(this.laundry, laundry);
		content.put(this.heat, heat);
		content.put(this.kitchen, kitchen);
		content.put(this.water, water);
	}
	
	public String getUtility(String requirement)throws InvalidUtilityException{
		if(content.containsKey(requirement)){
			return content.get(requirement);
		}
		throw new InvalidUtilityException();
	}	
}