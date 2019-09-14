package com.dithok.login.service.impl;

import com.dithok.login.entity.UserEntity;
import com.dithok.login.dto.UserDto;
import com.dithok.login.service.UserService;
import com.dithok.login.repository.UserRepository;
import com.dithok.login.utils.Utils;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import java.io.Serializable;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;

	@Autowired
	Utils utils;

	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public UserDto createUser(UserDto user){

		UserEntity userEntity = new UserEntity();
		BeanUtils.copyProperties(user, userEntity);
		
		String publicUserId = utils.generateUserId(30);
		userEntity.setUserEncryptedPassword(bCryptPasswordEncoder.encode(user.getUserPassword()));
		userEntity.setUserId(publicUserId);

		UserEntity storedUserDetails = userRepository.save(userEntity);

		UserDto returnedValue = new UserDto();
		BeanUtils.copyProperties(storedUserDetails, returnedValue);

		
		return returnedValue;
	}

	@Override
	public UserDetails loadUserByUsername(String arg0) throws UsernameNotFoundException{
		return null;
	}

};