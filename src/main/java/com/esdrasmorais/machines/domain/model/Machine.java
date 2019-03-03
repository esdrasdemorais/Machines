package com.esdrasmorais.machines.domain.model;

import java.time.Year;
import java.util.Date;
import java.util.List;

import com.esdrasmorais.machines.domain.model.interfaces.IMachine;
import com.google.common.collect.ImmutableList;
import com.esdrasmorais.ddd.repository.IdentifiedDomainObject;
import com.esdrasmorais.machines.domain.model.interfaces.IAccessory;
import com.esdrasmorais.machines.domain.model.interfaces.IEngine;;

public abstract class Machine extends IdentifiedDomainObject 
	implements IMachine
{
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
	protected List<MachinePhotos> photos;
	protected List<IAccessory> acessories;
	protected Double price;
	
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

	public Long getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(Long serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getPurchasePlace() {
		return purchasePlace;
	}

	public void setPurchasePlace(String purchasePlace) {
		this.purchasePlace = purchasePlace;
	}

	public Double getOriginalMilesHours() {
		return originalMilesHours;
	}

	public void setOriginalMilesHours(Double originalMilesHours) {
		this.originalMilesHours = originalMilesHours;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public List<IEngine> getEngines() {
		return engines;
	}

	public void setEngines(List<IEngine> engines) {
		this.engines = engines;
	}

	public Year getMadeIn() {
		return madeIn;
	}

	public void setMadeIn(Year madeIn) {
		this.madeIn = madeIn;
	}

	public List<MachinePhotos> getPhotos() {
		return this.photos;
	}

	public void setPhotos(List<MachinePhotos> photos) {
		this.photos = photos;
	}

	public List<IAccessory> getAcessories() {
		return acessories;
	}

	public void setAcessories(List<IAccessory> acessories) {
		this.acessories = acessories;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public String getType() {
		return type;
	}

	public Double getWeight() {
		return weight;
	}

	public Double getCapacity() {
		return capacity;
	}

	public Boolean getIsAvailable() {
		return isAvailable;
	}

	public Position getLocalization() {
		return localization;
	}

	public Boolean getHasFuel() {
		return hasFuel;
	}

	public String getBrand() {
		return brand;
	}
}
