package com.usertrgitration.user.service;

import javax.validation.Valid;

import com.usertrgitration.user.documents.User;

public interface UserService {

	User createUser(@Valid User user);

}
