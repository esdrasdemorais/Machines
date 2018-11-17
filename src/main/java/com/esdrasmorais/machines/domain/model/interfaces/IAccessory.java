package com.esdrasmorais.machines.domain.model.interfaces;

import java.time.Year;

public interface IAccessory {
	public void setDescription(String description);
	public void setPrice(Double price);
	public void setMadeIn(Year madeIn);
}
