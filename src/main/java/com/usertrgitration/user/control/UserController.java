package com.usertrgitration.user.control;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.usertrgitration.user.documents.User;
import com.usertrgitration.user.service.UserService;

@RestController
@RequestMapping("/api/")
@CrossOrigin(origins="http://localhost:4200")
public class UserController {
	@Autowired
	private UserService userservice;
	
	@PostMapping("user/create")
	public User createUser(@Valid @RequestBody User user) {
		user.setUserId(UUID.randomUUID());
		return userservice.createUser(user);
	} 

}
