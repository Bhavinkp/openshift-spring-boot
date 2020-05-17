package com.bkp.learning.pojo;

public class User {

	private int id;
	private String userName;
	private String userRight;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the userRight
	 */
	public String getUserRight() {
		return userRight;
	}
	/**
	 * @param userRight the userRight to set
	 */
	public void setUserRight(String userRight) {
		this.userRight = userRight;
	}
	
	public User(int id, String userName, String userRight) {
		super();
		this.id = id;
		this.userName = userName;
		this.userRight = userRight;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", userRight=" + userRight + ", getId()=" + getId()
				+ ", getUserName()=" + getUserName() + ", getUserRight()=" + getUserRight() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
