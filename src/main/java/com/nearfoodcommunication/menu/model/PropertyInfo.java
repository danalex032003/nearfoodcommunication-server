package com.nearfoodcommunication.menu.model;

public class PropertyInfo {
	
	private String propertyName;
	
	private Integer propertyId;

	private String propertyAdress;
	
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
