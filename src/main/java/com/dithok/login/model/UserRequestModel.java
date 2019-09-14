package com.dithok.login.model;

import java.util.Date;

public class UserRequestModel{

   	private String userName;
	private String userPassword;
	private String userMobileNumber;
	private String userEmailId;
	private String userGender;
	private String userDOB; //yyyy-mm-dd

	public UserRequestModel(){

	}
	
	//Constructor to initialize variables with data
	public UserRequestModel(String userName, 
				String userPassword,
				String userMobileNumber,
				String userEmailId,
				String userGender,
				String userDOB)
	{

		this.userName = userName;
		this.userPassword = userPassword;
		this.userMobileNumber = userMobileNumber;
		this.userEmailId = userEmailId;
		this.userGender = userGender;
		this.userDOB = userDOB;

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
	public String getUserPassword(){
		
		return userPassword;
	}


	public void setUserPassword(String userPassword){
		
		this.userPassword = userPassword;
	}

	//Mobile Number Setter & Getter Methods
	public String getUserMobileNumber(){
		
		return userMobileNumber;
	}


	public void setUserMobileNumber(String userMobileNumber){
		
		this.userMobileNumber = userMobileNumber;
	}

	//Email ID Setter & Getter Methods
	public String getUserEmailId(){
		
		return userEmailId;
	}


	public void setUserEmailId(String userEmailId){
		
		this.userEmailId = userEmailId;
		
	}


	//Gender Setter & Getter Methods
	public String getUserGender(){
		
		return userGender;
	}


	public void setUserGender(String userGender){
		
		this.userGender = userGender;
	}


	//DOB setter & Getter Methods
	public String getUserDOB(){
		
		return userDOB;
	}


	public void setUserDOB(String userDOB){
		
		this.userDOB = userDOB;
	}


};