package com.dithok.login.service.impl;

import com.dithok.login.entity.UserEntity;
import com.dithok.login.dto.UserDto;
import com.dithok.login.service.UserService;
import com.dithok.login.repository.UserRepository;

import org.apache.catalina.User;
import org.springframework.stereotype.Service;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;

	@Override
	public UserDto createUser(UserDto user){
		///checking if Email and Phone number is already stored///
		if(userRepository.findByEmail(user.getUserEmailId()) != null)throw new RuntimeException("Email already Registered!!");
		if(userRepository.findByNumber(user.getUserMobileNumber()) != null)throw new RuntimeException("Email already Registered!!");

		UserEntity userEntity = new UserEntity();
		BeanUtils.copyProperties(user, userEntity);
		
		userEntity.setUserEncryptedPassword("test");
		userEntity.setUserId("testUserId");

		UserEntity storedUserDetails2 = userRepository.save(userEntity);

		UserDto returnedValue = new UserDto();
		BeanUtils.copyProperties(storedUserDetails2, returnedValue);

		
		return returnedValue;
	}

};