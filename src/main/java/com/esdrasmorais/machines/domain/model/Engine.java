package com.esdrasmorais.machines.domain.model;

import java.util.Date;

import com.esdrasmorais.machines.domain.model.interfaces.IEngine;

public abstract class Engine implements IEngine {
	protected Long id;
	protected Date date;
	protected Date previousDate;
	protected String brand;
	protected Long odometer;
	protected Long previousOdometer;
	protected Long primaryPartNumber;
	protected Long secondPartNumber;
	protected Long thirdPartNumber;
	protected String notes;

	@Override
	public void setOdometer(Long serial) {
		
	}

	@Override
	public void setBrand(String brand) {
		
	}
}
