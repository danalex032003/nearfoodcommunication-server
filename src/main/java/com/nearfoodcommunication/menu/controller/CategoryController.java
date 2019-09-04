package com.nearfoodcommunication.menu.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nearfoodcommunication.menu.model.FoodItemInfo;


//@RestController
public class CategoryController {
	
//	@GetMapping(value = "/food-items/{id}")
	public List<FoodItemInfo> getFoodItems(@PathVariable int id) {
		List<FoodItemInfo> foodItems = new ArrayList<FoodItemInfo>();
		FoodItemInfo foodItem1 = new FoodItemInfo();
		foodItem1.setId(1);
		foodItem1.setName("Pizza");
		foodItem1.setPrice(20.00);
		foodItem1.setWeight(500);
		foodItem1.setDescription("Mozzarella, Sunca, Sos de rosii");
		
		FoodItemInfo foodItem2 = new FoodItemInfo();
		foodItem2.setId(2);
		foodItem2.setName("Paste");
		foodItem2.setPrice(19.50);
		foodItem2.setWeight(450);
		foodItem2.setDescription("Branza, Sunca");
		if (id == 1) {
			foodItems.add(foodItem1);
		}
		else {
			foodItems.add(foodItem2);
		}
		
		return foodItems;
	}
}