package com.log.CONTROLLER;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.log.ENTITY.User;
import com.log.REQUEST.LoginRequest;
import com.log.SERVICE.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("/addUser")
	@CrossOrigin(origins = "http://localhost:3000")
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);
	}
	
	@PostMapping("/loginUser")
	@CrossOrigin(origins = "http://localhost:3000")
	public boolean loginUser(@RequestBody LoginRequest loginReq) {
		return userService.loginUser(loginReq);
	}
}
