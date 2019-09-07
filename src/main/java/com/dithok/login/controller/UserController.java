package com.dithok.login.controller;

import com.dithok.login.model.UserModel;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.BeanUtils;


@RestController
@RequestMapping("/")
public class UserRestController{

	//POST route
	@RequestMapping(method = RequestMethod.POST, value = "/api/restaddusers")
	public String registerUser(@RequestBody UserRequestModel user){

		UserResponseModel returnValue = new UserResponseModel();

		UserDto userDto = new UserDto();
		BeanUtils.copyProperties(user, userDto);

		userDto createdUser = UserService.createUser(userDto);
		BeanUtils.copyProperties(createdUser, returnValue);

		return returnValue;
		// return "POST method is called. Username is <b>" + user.getUserName() + "</b>. Password is <b>" + user.getUserPassword()+"</b>";
	}	
}


	
