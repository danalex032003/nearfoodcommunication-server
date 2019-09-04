package com.nearfoodcommunication.menu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nearfoodcommunication.menu.model.MenuInfo;
import com.nearfoodcommunication.menu.service.MenuService;

@RestController
public class MenuController {

	@Autowired
	MenuService menuService;

	@GetMapping(value = "/food-categories/{propertyId}")
	public MenuInfo getMenu(@PathVariable int propertyId) {

		MenuInfo menu = menuService.getPropertyMenu(propertyId);

		return menu;
	}

}
