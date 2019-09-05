// register
package com.nearfoodcommunication.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nearfoodcommunication.user.model.User;
import com.nearfoodcommunication.user.service.UserService;

@RestController
public class LoginController {

	@Autowired
	UserService userService;
	
	@RequestMapping(method = RequestMethod.GET, value = "/login/{email}/{password}")
	public User redirect(@PathVariable String email, @PathVariable String password) {
		User user = userService.getUserByEmailAndPassword(email, password);
		
		return user;
	}
}