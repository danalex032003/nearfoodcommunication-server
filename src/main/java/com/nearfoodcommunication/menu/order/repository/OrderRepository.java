package com.nearfoodcommunication.menu.order.repository;

import org.springframework.data.repository.CrudRepository;

import com.nearfoodcommunication.menu.order.entity.OrderEntity;

public interface OrderRepository extends CrudRepository<OrderEntity, Integer> {
	
}
