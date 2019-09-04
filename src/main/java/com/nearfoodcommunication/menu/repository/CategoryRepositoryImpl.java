package com.nearfoodcommunication.menu.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nearfoodcommunication.menu.entity.FoodCategoryEntity;

@Repository
@Transactional(readOnly = true)
public class CategoryRepositoryImpl implements CategoryRepositoryCustom {

	private static final String SQL_QUERY_CATEGORIES_BY_PROPERTYID = "select * from nearfoodcommunication.category where id_property = ?";
	@PersistenceContext
	EntityManager entityManager;
	@Override
	public List<FoodCategoryEntity> getCategoriesByPropertyId(int propertyId) {
		// TODO Auto-generated method stub
		Query query = entityManager.createNativeQuery(SQL_QUERY_CATEGORIES_BY_PROPERTYID, FoodCategoryEntity.class);
		query.setParameter(1, propertyId);
		List<FoodCategoryEntity> categories = query.getResultList();
		return categories;
	}

}
