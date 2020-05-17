package com.bkp.learning.exception;

import java.util.Date;

public class ExceptionDescription {

	String message;
	Date date;
	String details;
	
	
	public ExceptionDescription() {
		// TODO Auto-generated constructor stub
	}


	public ExceptionDescription(String message, Date date, String details) {
		super();
		this.message = message;
		this.date = date;
		this.details = details;
	}


	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}


	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}


	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}


	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}


	/**
	 * @return the details
	 */
	public String getDetails() {
		return details;
	}


	/**
	 * @param details the details to set
	 */
	public void setDetails(String details) {
		this.details = details;
	}

}
