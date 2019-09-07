package com.dithok.login.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="users")
public class UserEntity implements Serializable{

	private static final long serialVersionUID = 1523651623123L;

	@Id
	@GeneraedValue
	private long id;

	@Column(nullable = false)
	private String userId;

	@Column(nullable = false, length=50)
   	private String userName;
	
	@Column(nullable = false, length=10)
	private String userMobileNumber;

	@Column(nullable = false, length=120)
	private String userEmailId;

	@Column(nullable = false)
	private String userGender;

	@Column(nullable = false, length=10)
	private String userDOB; //yyyy-mm-dd

	@Column(nullable = false)
	private String userEncryptedPassword;

	private String userEmailVerificationToken;

	@Column(nullable = false)
	private Boolean userEmailVerificationStatus = false;

	//User Id Setter & Getter Methods
	public long getId()
	{

		return Id;

	}

	public void setId(long Id)
	{

		this.Id = Id;

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
	public String getUserEmailID()
	{
		
		return userEmailID;
	
	}


	public void setUserEmailID(String userEmailID)
	{
		
		this.userEmailID = userEmailID;
		
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