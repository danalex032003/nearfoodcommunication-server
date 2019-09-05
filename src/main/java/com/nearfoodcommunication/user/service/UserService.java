package com.nearfoodcommunication.user.service;

import com.nearfoodcommunication.user.model.User;

public interface UserService {

	User getUserByEmailAndPassword(String email, String password);

}
