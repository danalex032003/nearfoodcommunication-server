package com.nearfoodcommunication.menu.order.model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class OrderInfo {

	private Integer idOrder;

	private Timestamp date;

	private Integer table;

	private Integer idProperty;

	private List<OrderLineInfo> orderLines = new ArrayList<>();

	public Integer getIdOrder() {
		return idOrder;
	}

	public void setIdOrder(Integer idOrder) {
		this.idOrder = idOrder;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public Integer getTable() {
		return table;
	}

	public void setTable(Integer table) {
		this.table = table;
	}

	public Integer getIdProperty() {
		return idProperty;
	}

	public void setIdProperty(Integer idProperty) {
		this.idProperty = idProperty;
	}

	public List<OrderLineInfo> getOrderLines() {
		return orderLines;
	}

	public void setOrderLines(List<OrderLineInfo> orderLines) {
		this.orderLines = orderLines;
	}

	

	
}
