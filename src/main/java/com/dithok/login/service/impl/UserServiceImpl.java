package com.dithok.login.service.impl;

import com.dithok.login.entity.UserEntity;
import com.dithok.login.dto.UserDto;
import com.dithok.login.service.UserService;
import com.dithok.login.UserRepository;

import org.springframework.stereotype.Service;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;

	@Override
	public UserDto createUser(UserDto user){

		UserEntity userEntity = new UserEntity();
		BeanUtils.copyProperties(user, userEntity);
		
		userEntity.setUserEncryptedPassword("test");
		userEntity.setUserId("testUserId");

		UserEntity storedUserDetails = userRepository.save(userEntity);

		UserDto returnedValue = new UserDto();
		BeanUtils.copyProperties(storedUserDetails, returnedValue);

		
		return returnedValue;
	}

};