package com.nearfoodcommunication.menu.order.service;

import com.nearfoodcommunication.menu.order.model.OrderInfo;

public interface OrderService {

	OrderInfo saveOrder(OrderInfo orderInfo);
	
//	OrderInfo sendOrder(OrderEntity orderEntity);
}
