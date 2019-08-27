package com.nearfoodcommunication.user.repository;

import org.springframework.data.repository.CrudRepository;

import com.nearfoodcommunication.user.entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Integer> {

}