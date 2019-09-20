package com.nearfoodcommunication.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nearfoodcommunication.user.entity.UserEntity;
import com.nearfoodcommunication.user.model.User;
import com.nearfoodcommunication.user.repository.UserRepository;

@RestController
@RequestMapping(value = "/users")

public class RegisterController {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping(value = "/add", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public UserEntity registerUser(@RequestBody User user) {
		
		UserEntity userEntity = new UserEntity();
		userEntity.setIdUser(user.getIdUser());
		userEntity.setFirstName(user.getFirstName());
		userEntity.setLastName(user.getLastName());
		userEntity.setEmail(user.getEmail());
		userEntity.setPassword(user.getPassword());
		userEntity.setType(user.getType());
		
		userEntity = userRepository.save(userEntity);
		
		return userEntity;
	}
}