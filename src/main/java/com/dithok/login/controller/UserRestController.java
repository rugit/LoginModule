package com.dithok.login.controller;

import com.dithok.login.model.UserRequestModel;
import com.dithok.login.model.UserResponseModel;
import com.dithok.login.repository.UserRepository;
import com.dithok.login.dto.UserDto;
import com.dithok.login.entity.UserEntity;
import com.dithok.login.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@RestController
@RequestMapping("/")
public class UserRestController{

	@Autowired
	UserService userService;
	@Autowired
	UserRepository _userRepo;
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
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
	
	@RequestMapping(method = RequestMethod.POST, value = "/api/login", consumes="application/x-www-form-urlencoded")
	public Map<String,String> loginUser(String username, String password)
	{
		Map<String,String> res = new HashMap<>();
		UserEntity user = _userRepo.findUserByuserEmailId(username);
		String originalPassword = user.getUserEncryptedPassword();
		if(bCryptPasswordEncoder.matches(password, originalPassword))
		{
			res.put("status","0");
		}
		else {
		res.put("status","1");
		}
		return res;
	}
		// return "POST method is called. Username is <b>" + user.getUserName() + "</b>. Password is <b>" + user.getUserPassword()+"</b>";
	
}
