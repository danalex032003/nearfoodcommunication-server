package com.nearfoodcommunication.order.controller;

import com.nearfoodcommunication.menu.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

public class OrderResponse {


	private String orderBody;

	public String getOrderBody() {
		return orderBody;
	}

	public void setOrderBody( String orderBody ) {
		this.orderBody = orderBody;
	}
}
