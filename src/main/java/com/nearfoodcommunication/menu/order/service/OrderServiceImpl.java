package com.nearfoodcommunication.menu.order.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.nearfoodcommunication.menu.order.entity.OrderEntity;
import com.nearfoodcommunication.menu.order.entity.OrderLineEntity;
import com.nearfoodcommunication.menu.order.model.OrderInfo;
import com.nearfoodcommunication.menu.order.model.OrderLineInfo;
import com.nearfoodcommunication.menu.order.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepository orderRepository;
	
	public OrderInfo saveOrder(OrderInfo orderInfo) {

		OrderEntity orderEntity = getOrderEntity(orderInfo);
		
		orderEntity = orderRepository.save(orderEntity);
				
		return getOrderInfo(orderEntity);
	}

	private OrderEntity getOrderEntity(OrderInfo orderInfo) {

		OrderEntity orderEntity = new OrderEntity();

		orderEntity.setDate(orderInfo.getDate());
		orderEntity.setIdOrder(orderInfo.getIdOrder());
		orderEntity.setIdProperty(orderInfo.getIdProperty());
		orderEntity.setOrderLine(getOrderLineEntities(orderInfo.getOrderLines()));
		orderEntity.setTable(orderInfo.getTable());

		return orderEntity;
	}

	private List<OrderLineEntity> getOrderLineEntities(List<OrderLineInfo> orderLineInfos) {

		List<OrderLineEntity> orderLineEntities = new ArrayList<>();
		
		if (!CollectionUtils.isEmpty(orderLineInfos)) {
			
			Iterator<OrderLineInfo> orderLineIterator = orderLineInfos.listIterator();
			
			while (orderLineIterator.hasNext()) {
				
				OrderLineInfo orderLineInfo = orderLineIterator.next();
				OrderLineEntity orderLineEntity = new OrderLineEntity();

				orderLineEntity.setIdOrder(orderLineInfo.getIdOrder());
				orderLineEntity.setIdOrderLine(orderLineInfo.getIdOrderLine());
				orderLineEntity.setName(orderLineInfo.getName());
				orderLineEntity.setQuantity(orderLineInfo.getQuantity());
				orderLineEntity.setUnitPrice(orderLineInfo.getUnitPrice());

				orderLineEntities.add(orderLineEntity);
			}
		}
		return orderLineEntities;
	}
	
	private OrderInfo getOrderInfo(OrderEntity orderEntity) {
		
		OrderInfo orderInfo = new OrderInfo();
		
		orderInfo.setIdOrder(orderEntity.getIdOrder());
		orderInfo.setIdProperty(orderEntity.getIdProperty());
		orderInfo.setOrderLines(getOrderLineInfos(orderEntity.getOrderLine()));
		orderInfo.setTable(orderEntity.getTable());
		orderInfo.setDate(orderEntity.getDate());
		
		return orderInfo;
	}
	
	private List<OrderLineInfo> getOrderLineInfos(List<OrderLineEntity> orderLineEntities) {
		
		List<OrderLineInfo> orderLineInfos = new ArrayList<>();
		
		if (!CollectionUtils.isEmpty(orderLineEntities)) {
			
			Iterator<OrderLineEntity> orderLineIterator = orderLineEntities.listIterator();
			
			while(orderLineIterator.hasNext()) {
				
				OrderLineEntity orderLineEntity = orderLineIterator.next();
				OrderLineInfo orderLineInfo = new OrderLineInfo();
				
				orderLineInfo.setIdOrder(orderLineEntity.getIdOrder());
				orderLineInfo.setIdOrderLine(orderLineEntity.getIdOrderLine());
				orderLineInfo.setName(orderLineEntity.getName());
				orderLineInfo.setQuantity(orderLineEntity.getQuantity());
				orderLineInfo.setQuantity(orderLineEntity.getQuantity());
				orderLineInfo.setUnitPrice(orderLineEntity.getUnitPrice());
				
				orderLineInfos.add(orderLineInfo);
			}
			
		}
		
		return orderLineInfos;
	}
}
