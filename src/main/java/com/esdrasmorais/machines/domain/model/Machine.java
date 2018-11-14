package com.esdrasmorais.machines.domain.model;

import java.time.Year;
import java.util.Date;
import java.util.List;

import com.esdrasmorais.machines.domain.model.interfaces.IMachine;
import com.esdrasmorais.machines.domain.model.interfaces.IAccessory;
import com.esdrasmorais.machines.domain.model.interfaces.IEngine;;

public abstract class Machine implements IMachine {
	protected Long id;
	protected Long serialNumber;
	protected String product;
	protected String version;
	protected String model;
	protected Date purchaseDate;
	protected String purchasePlace;
	protected Double originalMilesHours;
	protected String notes;
	protected List<IEngine> engines;
	protected String type;
	protected Double weight;
	protected Double capacity;
	protected Year madeIn;
	protected Boolean isAvailable;
	protected Position localization;
	protected Boolean hasFuel;
	protected String brand;
	protected Image frontPhoto; 
	protected Image backPhoto;
	protected Image sidePhoto;
	protected List<IAccessory> acessories;
	
	@Override
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public void setWeight(Double weight) {
		this.weight = weight;
	}

	@Override
	public void setCapacity(Double capacity) {
		this.capacity = capacity;
	}

	@Override
	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	@Override
	public void setLocalization(Position position) {
		this.localization = position;
	}

	@Override
	public void setHasFuel(Boolean hasFuel) {
		this.hasFuel = hasFuel;
	}

	@Override
	public void setBrand(String brand) {
		this.brand = brand;
	}
}
