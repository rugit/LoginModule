package com.dithok.login.model;

public class UserModel{

   	private String userName;
	private String userPassword;
	private String userMobileNumber;
	private String userEmailID;
	private String userAddress;
	private String userGender;

	public UserModel(){

	}
	
	//Constructor to initialize variables with data
	public UserModel(String userName, 
				String userPassword,
				String userMobileNumber,
				String userEmailID,
				String userAddress,
				String userGender)
	{

		this.userName = userName;
		this.userPassword = userPassword;
		this.userMobileNumber = userMobileNumber;
		this.userEmailID = userEmailID;
		this.userAddress = userAddress;
		this.userGender = userGender;
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
	public String getUserEmailID(){
		
		return userEmailID;
	}


	public void setUserEmailID(String userEmailID){
		
		this.userEmailID = userEmailID;
		
	}

	//Address Setter & Getter Methods
	public String getUserAddress(){
		
		return userAddress;
	}


	public void setUserAddress(String userAddress){
		
		this.userAddress = userAddress;
	}

	//Gender Setter & Getter Methods
	public String getUserGender(){
		
		return userGender;
	}


	public void setUserGender(String userGender){
		
		this.userGender = userGender;
	}





};