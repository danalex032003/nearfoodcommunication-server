package com.nearfoodcommunication.menu.model;

import java.util.List;

public class MenuInfo {
	
	private PropertyInfo property;
	
	private List<FoodCategoryInfo> foodCategories;

	public PropertyInfo getProperty() {
		return property;
	}

	public void setProperty(PropertyInfo property) {
		this.property = property;
	}

	public List<FoodCategoryInfo> getFoodCategories() {
		return foodCategories;
	}

	public void setFoodCategories(List<FoodCategoryInfo> foodCategories) {
		this.foodCategories = foodCategories;
	}

	
	
	
}
