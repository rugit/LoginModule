package com.dithok.login.controller;

import com.dithok.login.model.UserModel;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class UserController{

	//Default route 
	@RequestMapping("/")
	@GetMapping
	public String helloWorld()
	{
		return "<h1>Hello Users!! Page is currently being build. other route '/api/users', '/api/addusers' use postman</h1>";
	}

	//GET route to return class structure
	@RequestMapping("/api/users")
	public Object apiUsers()
	{
		return "{userName : xyz , userPassword : xyz, userMobileNumber: xyz, userEmailID: xyz, userAddress: xyz, userGender : xyz}";
	}

	//GET route
	@RequestMapping("/api/addusers")
	public String getData(@RequestParam(value = "userName", defaultValue="Anupal", required=false) String userName,
						@RequestParam(value = "userPassword", defaultValue="notaprogrammeryet", required=false) String userPassword,
						@RequestParam(value = "userMobileNumber", defaultValue="0000000000", required=false) String userMobileNumber,
						@RequestParam(value = "userEmailID", defaultValue="johndoe@gmail.com", required=false) String userEmailID,
						@RequestParam(value = "userAddress", defaultValue="unknown", required=false) String userAddress,
						@RequestParam(value = "userGender", defaultValue="male", required=false) String userGender
						)
	{
		
		UserModel user = new UserModel(userName, userPassword, userMobileNumber, userEmailID, userAddress, userGender);

		return "GET method is called. Username is <b>" + user.getUserName() + "</b>. MobileNumber is <b>" + user.getUserMobileNumber()+"</b>";
		
	}

	//POST route
	@RequestMapping(method = RequestMethod.POST, value = "/api/addusers")
	public String registerUser(@RequestBody UserModel user){

		return "POST method is called. Username is <b>" + user.getUserName() + "</b>. Password is <b>" + user.getUserPassword()+"</b>";
	}	
}


	
