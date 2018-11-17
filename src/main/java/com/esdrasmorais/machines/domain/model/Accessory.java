package com.esdrasmorais.machines.domain.model;

import java.time.Year;

import com.esdrasmorais.ddd.repository.IdentifiedDomainObject;
import com.esdrasmorais.machines.domain.model.interfaces.IAccessory;

public abstract class Accessory extends IdentifiedDomainObject 
	implements IAccessory
{
	protected String description;
	protected Double price;
	protected Year madeIn;
	protected String brand;
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Double getPrice() {
		return this.price;
	}
	
	public void setMadeIn(Year madeIn) {
		this.madeIn = madeIn;
	}
	
	public Year getMadeIn() {
		return this.madeIn;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return this.brand;
	}
}
