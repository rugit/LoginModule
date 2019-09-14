package com.dithok.login.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import com.dithok.login.dto.UserDto;

public interface UserService extends UserDetailsService{
	UserDto createUser(UserDto user);
};