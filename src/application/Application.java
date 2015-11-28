package application;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

import housing.HousingPost;
import housing.PostManager;
import housing.User;
import housing.UserManager;

public class Application implements Serializable{

	private static final long serialVersionUID = 3819108003933449000L;

	
	public boolean logIn(String userName, String password) throws UserNotExistsException{
		if (UserManager.users.containsKey(userName)){
			return UserManager.users.get(userName).getPassword() == password;
		}
		throw new UserNotExistsException();
	}
	
	public void createAccount(String userName, String password, String email){
		User newUser = new User(userName, password, email);
		UserManager.addUser(newUser);
		
	}
	
	public ArrayList<HousingPost> searchResult(String...requirements){
		ArrayList<HousingPost> retList = new ArrayList<HousingPost>();
		Set<ArrayList<HousingPost>> lists = new TreeSet<ArrayList<HousingPost>>();
		for (String requirement : requirements){
			lists.add(PostManager.Included(requirement));
		}
		
		ArrayList<HousingPost> compare = ((TreeSet<ArrayList<HousingPost>>) lists).first(); 
		for (ArrayList<HousingPost> item : lists){
			if (item.size() > compare.size()){
				compare = item;
			}			
		}
		for (HousingPost post : compare){
			boolean flag = true;
			for (ArrayList<HousingPost> postLists : lists){
				if (! postLists.contains(post)){
					flag = false;
				}
			}
			if (flag){
				retList.add(post);
			}
		}
		return retList;
	}
	
	// TODO
	public void displaySearchResult(){
		
	}
}
