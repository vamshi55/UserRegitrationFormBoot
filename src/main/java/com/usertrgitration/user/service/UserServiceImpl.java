package com.usertrgitration.user.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usertrgitration.user.documents.User;
import com.usertrgitration.user.repository.UserRepository;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userrep;
	
	

	@Override
	public User createUser(@Valid User user) {
		return userrep.insert(user);
	}
	
	
	

}
