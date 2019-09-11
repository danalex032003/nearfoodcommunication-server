package com.nearfoodcommunication.menu.property.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "property")
public class PropertyEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column( name = "id_property")
	private Integer propertyId;
	
	@Column( name = "name")
	private String propertyName;

	@Column( name = "adress")
	private String propertyAdress;
	
	@Column( name = "no_tables")
	private Integer noTables;
	
	public Integer getNoTables() {
		return noTables;
	}

	public void setNoTables(Integer noTables) {
		this.noTables = noTables;
	}

	public String getPropertyAdress() {
		return propertyAdress;
	}

	public void setPropertyAdress(String propertyAdress) {
		this.propertyAdress = propertyAdress;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public Integer getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(Integer propertyId) {
		this.propertyId = propertyId;
	}
	
}
