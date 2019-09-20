package com.nearfoodcommunication.menu.order.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_line")
public class OrderLineEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_oline")
	private Integer idOrderLine;
	
	private String name;
	
	@Column(name = "unit_price")
	private double unitPrice;
	
	@Column(name = "id_order")
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
