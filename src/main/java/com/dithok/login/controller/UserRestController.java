package com.dithok.login.controller;

import com.dithok.login.model.UserRequestModel;
import com.dithok.login.model.UserResponseModel;
import com.dithok.login.dto.UserDto;
import com.dithok.login.service.UserService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/")
public class UserRestController{

	@Autowired
	UserService userService;

	//POST route
	@RequestMapping(method = RequestMethod.POST, value = "/api/restaddusers")
	public String createUser(@RequestBody UserRequestModel user){

		UserResponseModel returnValue = new UserResponseModel();

		UserDto userDto = new UserDto();
		BeanUtils.copyProperties(user, userDto);

		userDto createdUser = UserService.createUser(userDto);
		BeanUtils.copyProperties(createdUser, returnValue);

		return returnValue;
		// return "POST method is called. Username is <b>" + user.getUserName() + "</b>. Password is <b>" + user.getUserPassword()+"</b>";
	}	
}
