package com.coda.sms.exception;

public class UserNameNotFoundException  extends Exception {
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 * This Exception is thrown from LoginService class with error
	 * message <i>LoginService.CUSTOMER_NOT_FOUND</i> if the given 
	 * <b>customerId</b> is not matching any existing record.
	 * 
	 * @author ETA_JAVA
	 *
	 */
	public UserNameNotFoundException(String message)
	{
		super(message);
	}
}
