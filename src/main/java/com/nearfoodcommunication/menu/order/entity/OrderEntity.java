package com.nearfoodcommunication.menu.order.entity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "restaurant_order")
public class OrderEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id_order")
	private Integer idOrder;
	
	@Column(name = "creation_date")
	private Timestamp date;
	
	@Column(name = "table_number")
	private Integer table;
	
	@Column(name = "id_property")
	private Integer idProperty;
	
	@OneToMany(
			cascade = CascadeType.ALL,
			orphanRemoval = true)
	@JoinColumn(name = "id_order")
	private List<OrderLineEntity> orderLine = new ArrayList<>();

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

	public List<OrderLineEntity> getOrderLine() {
		return orderLine;
	}

	public void setOrderLine(List<OrderLineEntity> orderLine) {
		this.orderLine = orderLine;
	}
	
	
}
