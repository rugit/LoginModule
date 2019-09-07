package com.dithok.login.model;

//import uses in for databse
import javax.persistence.*;


@Entity (name="Dithok_login")//tells hibernate to make table from this class
public class UserModel{
	

	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
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
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="User_Name")
	public String getUserName()
	{

		return userName;
	}

	public void setUserName(String userName)
	{
		
		this.userName = userName;
	}

	//Password Setter & Getter Methods
	@Column(name="User_Password")
	public String getUserPassword(){
		
		return userPassword;
	}


	public void setUserPassword(String userPassword){
		
		this.userPassword = userPassword;
	}

	//Mobile Number Setter & Getter Methods
	@Column(name="Mobile_Number")
	public String getUserMobileNumber(){
		
		return userMobileNumber;
	}


	public void setUserMobileNumber(String userMobileNumber){
		
		this.userMobileNumber = userMobileNumber;
	}

	//Email ID Setter & Getter Methods
	@Column(name="Email_ID")
	public String getUserEmailID(){
		
		return userEmailID;
	}


	public void setUserEmailID(String userEmailID){
		
		this.userEmailID = userEmailID;
		
	}

	//Address Setter & Getter Methods
	@Column(name="Address")
	public String getUserAddress(){
		
		return userAddress;
	}


	public void setUserAddress(String userAddress){
		
		this.userAddress = userAddress;
	}

	//Gender Setter & Getter Methods
	@Column(name="Gender")
	public String getUserGender(){
		
		return userGender;
	}


	public void setUserGender(String userGender){
		
		this.userGender = userGender;
	}





};