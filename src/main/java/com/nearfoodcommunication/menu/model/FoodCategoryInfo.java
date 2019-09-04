package com.nearfoodcommunication.menu.model;

import java.util.List;

public class FoodCategoryInfo {
	
	private Integer id;
		
	private String name;
	
	private String pictureUrl;
	
	private Integer idProperty;
	
	private List<FoodItemInfo> foodItemInfos;

	public List<FoodItemInfo> getFoodItemInfos() {
		return foodItemInfos;
	}

	public void setFoodItemInfos(List<FoodItemInfo> foodItemInfos) {
		this.foodItemInfos = foodItemInfos;
	}

	public Integer getIdProperty() {
		return idProperty;
	}

	public void setIdProperty(Integer idProperty) {
		this.idProperty = idProperty;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPictureUrl() {
		return pictureUrl;
	}

	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}
	
	
}
