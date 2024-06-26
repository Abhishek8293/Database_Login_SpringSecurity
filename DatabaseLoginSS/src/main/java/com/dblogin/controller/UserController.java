package com.dblogin.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dblogin.dto.UserRegistrationDto;
import com.dblogin.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/register")
	public String registerUser(@RequestBody UserRegistrationDto user ) {
		return userService.registerUser(user);
	}
	
	@GetMapping("/success")
	public String afterLoginSuccess() {
		return "Welcome to home page after successful login";
	}
	
	@GetMapping("/out")
	public String afterLogoutSuccess() {
		return "Welcome to home page after successful logout";
	}
	
	@GetMapping("/permit")
	public String permitMethod() {
		return "This api does not need any authentication";
	}
	
	

}
