package com.bkp.learning.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.bkp.learning.pojo.User;

@Component
public class UserDao extends ArrayList{

	private static List<User> userList = new ArrayList<User>();
	
	private static int id = 5;
	
	static {
		userList.add(new User(1, "Bhavin Panchal", "Admin"));
		userList.add(new User(2, "B K Panchal", "Superviosr"));
		userList.add(new User(3, "Bholi Panchal", "User"));
		userList.add(new User(4, "Komal Panchal", "Admin"));
		userList.add(new User(5, "K B Panchal", "Supervisor"));
	}

	public static List<User> getAllUserList() {
		return userList;
	}

	/*
	 * private static void setUserList(List<User> userList) { UserDao.userList =
	 * userList; }
	 */
	
	public User addUser(User user) {
		if (0==user.getId()) {
			System.out.println("Id was null for Newly added Object, Hence generating id from system. -");
			user.setId(++id);
		}
		userList.add(user);
		return user;
	}
	
	public User getUserById(int userId) {
		for (User user1 : userList) {
			if (user1.getId()==userId)
			{
				return user1;
			}
		}
		return null;
	}
	
	public boolean updateUserById(User user) {
		int indexToModify= 0;
		boolean updateUser= false;
		for (User user1 : userList) {
			if (user1.getId()==user.getId())
			{
				indexToModify=userList.indexOf(user1);
				updateUser=true;
				break;
			}
		}
		if(updateUser) {
			userList.get(indexToModify).setUserName(user.getUserName());
			userList.get(indexToModify).setUserRight(user.getUserRight());
			return true;
		}
		return false;
	}
	
	public boolean deleteUserById(int userId) {
		int indexToModify= 0;
		boolean deleteUser= false;
		for (User user1 : userList) {
			if (user1.getId()==userId)
			{
				indexToModify=userList.indexOf(user1);
				deleteUser=true;
				break;
			}
		}
		if(deleteUser) {
			userList.remove(indexToModify);
			return true;
		}
		return false;
	}
	
}
