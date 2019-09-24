package com.nearfoodcommunication.menu.order.model;

public class OrderLineInfo {

	private Integer idOrderLine;

	private String name;

	private double unitPrice;

	private Integer idOrder;

	private Integer quantity;

	public Integer getIdOrderLine() {
		return idOrderLine;
	}

	public void setIdOrderLine(Integer idOrderLine) {
		this.idOrderLine = idOrderLine;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Integer getIdOrder() {
		return idOrder;
	}

	public void setIdOrder(Integer idOrder) {
		this.idOrder = idOrder;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	
}
