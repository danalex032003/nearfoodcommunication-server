package com.nearfoodcommunication.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nearfoodcommunication.user.entity.UserEntity;
import com.nearfoodcommunication.user.model.User;
import com.nearfoodcommunication.user.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	public User getUserByEmailAndPassword(String email, String password) {
		UserEntity userEntity = userRepository.getUserByEmailAndPassword(email, password);

		User user = new User();
		
		if (userEntity != null) {
			user.setEmail(userEntity.getEmail());
			user.setFirstName(userEntity.getFirstName());
			user.setIdUser(userEntity.getIdUser());
			user.setLastName(userEntity.getLastName());
			user.setPassword(userEntity.getPassword());
			user.setType(userEntity.getType());
		}

		return user;
	}

}
