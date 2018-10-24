package com.esdrasmorais.machines.domain.model;

import java.util.Date;
import java.util.List;

import com.esdrasmorais.machines.domain.model.interfaces.IMachine;
import com.esdrasmorais.machines.domain.model.interfaces.IEngine;;

public abstract class Machine implements IMachine {
	protected Long id;
	protected Long serialNumber;
	protected String product;
	protected String version;
	protected Date model;
	protected Date purchaseDate;
	protected String purchasePlace;
	protected Double originalMilesHours;
	protected String notes;
	protected List<IEngine> engine;
}
