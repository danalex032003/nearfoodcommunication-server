package com.nearfoodcommunication.menu.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class FoodCategoryEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column( name = "id_category")
	private Integer id;
	
	private String name;
	
	@Column( name = "picture_url")
	private String pictureUrl;
	
	@Column( name = "id_property")
	private Integer idProperty;

	@OneToMany(
			cascade = CascadeType.ALL,
			orphanRemoval = true)
	@JoinColumn(name = "id_category")
	List<FoodItemEntity> foodItems = new ArrayList<>();
	
	public void addFoodItem(FoodItemEntity foodItem) {
//		foodItem.setCategory(this);
		foodItems.add(foodItem);
	}
	public void removeFoodItem(FoodItemEntity foodItem) {
//		foodItem.setCategory(null);
		foodItems.remove(foodItem);
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
	public List<FoodItemEntity> getFoodItems() {
		return foodItems;
	}
	public void setFoodItems(List<FoodItemEntity> foodItems) {
		this.foodItems = foodItems;
	}
	
	
}
