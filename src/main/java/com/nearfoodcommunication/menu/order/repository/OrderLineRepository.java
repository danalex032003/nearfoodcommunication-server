package com.nearfoodcommunication.menu.order.repository;

import org.springframework.data.repository.CrudRepository;

import com.nearfoodcommunication.menu.order.entity.OrderLineEntity;

public interface OrderLineRepository extends CrudRepository<OrderLineEntity, Integer> {
	
}
