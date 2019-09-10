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
	@RequestMapping(method = RequestMethod.POST, value = "/api/restaddusers", consumes = "application/json")
	public Boolean createUsers(@RequestBody UserRequestModel user){

		try{
			UserResponseModel returnValue = new UserResponseModel();

			UserDto userDto = new UserDto();
			BeanUtils.copyProperties(user, userDto);

			UserDto createdUser = userService.createUser(userDto);
			BeanUtils.copyProperties(createdUser, returnValue);

			return true;
		}
		catch(Exception e){
			return false;
		}
	}

	@RequestMapping(method = RequestMethod.POST, value = "/api/restaddusers", consumes = "application/x-www-form-urlencoded")
	public Boolean createUsersEncoded(UserRequestModel user){

		try{
			UserResponseModel returnValue = new UserResponseModel();

			UserDto userDto = new UserDto();
			BeanUtils.copyProperties(user, userDto);

			UserDto createdUser = userService.createUser(userDto);
			BeanUtils.copyProperties(createdUser, returnValue);

			return true;
		}
		catch(Exception e){
			return false;
		}

	}	
		// return "POST method is called. Username is <b>" + user.getUserName() + "</b>. Password is <b>" + user.getUserPassword()+"</b>";
	
}
