package com.nearfoodcommunication.order.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class OrderController {

//	@PostMapping(value = "/order")
	public OrderResponse saveOrder(@RequestBody String order) {

		OrderResponse orderResponse = new OrderResponse();
		orderResponse.setOrderBody( order );

		return orderResponse;
	}

}
