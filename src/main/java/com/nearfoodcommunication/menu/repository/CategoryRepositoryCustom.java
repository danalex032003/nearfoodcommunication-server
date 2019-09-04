package com.nearfoodcommunication.menu.repository;

import java.util.List;

import com.nearfoodcommunication.menu.entity.FoodCategoryEntity;

public interface CategoryRepositoryCustom {
	
	List<FoodCategoryEntity> getCategoriesByPropertyId(int propertyId);
	
}
