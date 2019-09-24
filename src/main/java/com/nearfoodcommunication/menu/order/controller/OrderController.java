package com.nearfoodcommunication.menu.order.controller;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nearfoodcommunication.menu.order.entity.OrderEntity;
import com.nearfoodcommunication.menu.order.model.OrderInfo;
import com.nearfoodcommunication.menu.order.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping(value = "/order", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public OrderInfo saveOrder(@RequestBody OrderInfo orderInfo) {
		
		orderInfo.setDate(new Timestamp(new Date().getTime()));
		OrderInfo savedOrder = orderService.saveOrder(orderInfo);
		
		return savedOrder;
	}
}
