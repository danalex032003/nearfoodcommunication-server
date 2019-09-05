package com.nearfoodcommunication.user.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.util.CollectionUtils;

import com.nearfoodcommunication.user.entity.UserEntity;

public class UserRepositoryImpl implements UserRepositoryCustom {

	private static final String SQL_QUERY_USER_BY_EMAIL_AND_PASSWORD = "select * from nearfoodcommunication.user where email = ? and password = ?";
	@PersistenceContext
	EntityManager entityManager;
	
	public UserEntity getUserByEmailAndPassword(String email, String password) {
		// TODO Auto-generated method stub
		Query query = entityManager.createNativeQuery(SQL_QUERY_USER_BY_EMAIL_AND_PASSWORD, UserEntity.class);
		query.setParameter(1, email);
		query.setParameter(2, password);
		List<UserEntity> users = query.getResultList();
		
		UserEntity user = null;
		
		if (!CollectionUtils.isEmpty(users) && users.size() == 1) {
			user = users.get(0);
		}
		
		return user;
	}

}
