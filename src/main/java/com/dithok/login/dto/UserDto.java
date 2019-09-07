package com.dithok.login.dto;

import java.io.Serializable;

public class UserDto implements Serializable{

	private static final long serialVersionUID = 451232167362L;
	private long id;
	private String userId;
   	private String userName;
	private String userPassword;
	private String userMobileNumber;
	private String userEmailId;
	private String userGender;
	private String userDOB; //yyyy-mm-dd
	private String userEncryptedPassword;
	private String userEmailVerificationToken;
	private Boolean userEmailVerificationStatus = false;

	//User Id Setter & Getter Methods
	public long getId()
	{

		return id;

	}

	public void setId(long id)
	{

		this.id = id;

	}

	//User Id Setter & Getter Methods
	public String getUserId()
	{

		return userId;

	}

	public void setUserId(String userId)
	{

		this.userId = userId;

	}

	//Name Setter & Getter Methods
	public String getUserName()
	{

		return userName;
	}

	public void setUserName(String userName)
	{
		
		this.userName = userName;
	}

	//Password Setter & Getter Methods
	public String getUserPassword()
	{
		
		return userPassword;
	
	}


	public void setUserPassword(String userPassword)
	{
		
		this.userPassword = userPassword;
	
	}

	//Mobile Number Setter & Getter Methods
	public String getUserMobileNumber()
	{
		
		return userMobileNumber;
	
	}


	public void setUserMobileNumber(String userMobileNumber)
	{
		
		this.userMobileNumber = userMobileNumber;
	
	}

	//Email ID Setter & Getter Methods
	public String getUserEmailId()
	{
		
		return userEmailId;
	
	}


	public void setUserEmailId(String userEmailId)
	{
		
		this.userEmailId = userEmailId;
		
	}


	//Gender Setter & Getter Methods
	public String getUserGender()
	{
		
		return userGender;
	
	}


	public void setUserGender(String userGender)
	{
		
		this.userGender = userGender;
	
	}


	//DOB setter & Getter Methods
	public String getUserDOB()
	{
		
		return userDOB;
	
	}


	public void setUserDOB(String userDOB)
	{
		
		this.userDOB = userDOB;
	
	}

	//Encrypted Password setter & getter methods
	public String getUserEncryptedPassword()
	{

		return userEncryptedPassword;

	}

	public void setuserEncryptedPassword(String userEncryptedPassword)
	{

		this.userEncryptedPassword = userEncryptedPassword;

	}

	//Email Id Verfication Token setter and getter methods
	public String getUserEmailVerificationToken()
	{

		return userEmailVerificationToken;

	}

	public void setUserEmailVerificationToken(String userEmailVerificationToken)
	{

		this.userEmailVerificationToken = userEmailVerificationToken;

	}

	//Email Id Verfication Status setter and getter methods
	public Boolean getUserEmailVerificationStatus()
	{

		return userEmailVerificationStatus;

	}

	public void setUserEmailVerificationStatus(Boolean userEmailVerificationStatus)
	{

		this.userEmailVerificationStatus = userEmailVerificationStatus;

	}

};