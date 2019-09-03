package com.dithok.login.controller;

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
}