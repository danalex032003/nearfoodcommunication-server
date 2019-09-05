package com.nearfoodcommunication.user.repository;

import com.nearfoodcommunication.user.entity.UserEntity;

public interface UserRepositoryCustom {

	UserEntity getUserByEmailAndPassword(String email, String password);
}
