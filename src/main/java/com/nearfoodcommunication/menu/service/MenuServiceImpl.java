package com.nearfoodcommunication.menu.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.nearfoodcommunication.menu.entity.FoodCategoryEntity;
import com.nearfoodcommunication.menu.entity.FoodItemEntity;
import com.nearfoodcommunication.menu.model.FoodCategoryInfo;
import com.nearfoodcommunication.menu.model.FoodItemInfo;
import com.nearfoodcommunication.menu.model.MenuInfo;
import com.nearfoodcommunication.menu.model.PropertyInfo;
import com.nearfoodcommunication.menu.property.entity.PropertyEntity;
import com.nearfoodcommunication.menu.property.repository.PropertyRepository;
import com.nearfoodcommunication.menu.repository.CategoryRepository;

@Service
public class MenuServiceImpl implements MenuService {

	@Autowired
	CategoryRepository categoryRepository;

	@Autowired
	PropertyRepository propertyRepository;

	public MenuInfo getPropertyMenu(int propertyId) {

		List<FoodCategoryEntity> foodCategoryEntities = categoryRepository.getCategoriesByPropertyId(propertyId);

		List<FoodCategoryInfo> foodCategoryInfos = getFoodCategoryInfos(foodCategoryEntities);

		MenuInfo menuInfo = new MenuInfo();

		Optional<PropertyEntity> propertyEntityOptional = propertyRepository.findById(propertyId);

		if (propertyEntityOptional.isPresent()) {
			PropertyEntity propertyEntity = propertyEntityOptional.get();

			PropertyInfo propertyInfo = getProperty(propertyEntity);

			menuInfo.setProperty(propertyInfo);
		}

		menuInfo.setFoodCategories(foodCategoryInfos);
		return menuInfo;
	}

	private List<FoodCategoryInfo> getFoodCategoryInfos(List<FoodCategoryEntity> foodCategoryEntities) {

		List<FoodCategoryInfo> foodCategoryInfos = new ArrayList<>();
		
		if (!CollectionUtils.isEmpty(foodCategoryEntities)) {
			for (int i = 0; i < foodCategoryEntities.size(); i++) {
				FoodCategoryEntity currentCategory = foodCategoryEntities.get(i);
				
				FoodCategoryInfo foodCategoryInfo = new FoodCategoryInfo();
				foodCategoryInfo.setId(currentCategory.getId());
				foodCategoryInfo.setIdProperty(currentCategory.getIdProperty());
				foodCategoryInfo.setName(currentCategory.getName());
				foodCategoryInfo.setPictureUrl(currentCategory.getPictureUrl());
				foodCategoryInfo.setFoodItemInfos(getFoodItemInfos(currentCategory.getFoodItems()));

				foodCategoryInfos.add(foodCategoryInfo);
			}
		}
		return foodCategoryInfos;
	}

	private List<FoodItemInfo> getFoodItemInfos(List<FoodItemEntity> foodItemEntities) {

		List<FoodItemInfo> foodItemInfos = new ArrayList<>();
		
		if (!CollectionUtils.isEmpty(foodItemEntities)) {
			Iterator<FoodItemEntity> foodItemsIterator = foodItemEntities.listIterator();
			while (foodItemsIterator.hasNext()) {
				FoodItemEntity foodItemEntity = foodItemsIterator.next();
				FoodItemInfo foodItemInfo = new FoodItemInfo();
				
				foodItemInfo.setDescription(foodItemEntity.getDescription());
				foodItemInfo.setId(foodItemEntity.getId());
				foodItemInfo.setName(foodItemEntity.getName());
				foodItemInfo.setPictureUrl(foodItemEntity.getPictureUrl());
				foodItemInfo.setPrice(foodItemEntity.getPrice());
				foodItemInfo.setWeight(foodItemEntity.getWeight());

				foodItemInfos.add(foodItemInfo);
			}
		}
		return foodItemInfos;

	}

	private PropertyInfo getProperty(PropertyEntity propertyEntity) {

		PropertyInfo propertyInfo = new PropertyInfo();
		propertyInfo.setPropertyAdress(propertyEntity.getPropertyAdress());
		propertyInfo.setPropertyId(propertyEntity.getPropertyId());
		propertyInfo.setPropertyName(propertyEntity.getPropertyName());
		propertyInfo.setNoTables(propertyEntity.getNoTables());

		return propertyInfo;
	}

}
