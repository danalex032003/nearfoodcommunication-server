package com.nearfoodcommunication.menu.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nearfoodcommunication.menu.model.FoodItem;


@RestController
public class MenuController {
	
	@GetMapping(value="/food-items/{id}")
	public List<FoodItem> getFoodItems(@PathVariable int id) {
		List<FoodItem> foodItems = new ArrayList<FoodItem>();
		FoodItem foodItem1 = new FoodItem();
		foodItem1.setId(1);
		foodItem1.setName("Pizza");
		foodItem1.setPrice(20.00);
		foodItem1.setWeight(500);
		foodItem1.setDescription("Mozzarella, Sunca, Sos de rosii");
		
		FoodItem foodItem2 = new FoodItem();
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