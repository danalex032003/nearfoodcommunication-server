package com.nearfoodcommunication.menu.order.service;

import com.nearfoodcommunication.menu.order.entity.OrderEntity;
import com.nearfoodcommunication.menu.order.model.OrderInfo;

public interface OrderService {

	OrderEntity saveOrder(OrderInfo orderInfo);
}
