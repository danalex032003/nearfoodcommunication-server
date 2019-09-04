package com.nearfoodcommunication.menu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nearfoodcommunication.menu.entity.FoodCategoryEntity;

@Repository
public interface CategoryRepository extends JpaRepository<FoodCategoryEntity, Integer>, CategoryRepositoryCustom{
	
}
