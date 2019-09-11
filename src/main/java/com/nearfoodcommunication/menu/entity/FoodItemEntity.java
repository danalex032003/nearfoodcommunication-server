package com.nearfoodcommunication.menu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "food_item")
public class FoodItemEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column( name = "id_food" )
	private int id;
	
	private String name;
	
	private double price;
	
	private String description;
	
	@Column(name = "id_category")
	private int categoryId;
	
	private int weight;// in gramms
	
	@Column( name = "picture_url")
	private String pictureUrl;
	
	/*
	 * @ManyToOne(fetch = FetchType.LAZY)
	 * 
	 * @JoinColumn(name = "id_category") private FoodCategoryEntity category;
	 * 
	 * public FoodCategoryEntity getCategory() { return category; }
	 * 
	 * public void setCategory(FoodCategoryEntity category) { this.category =
	 * category; }
	 */

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public String getPictureUrl() {
		return pictureUrl;
	}

	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	
	
	
	
}
