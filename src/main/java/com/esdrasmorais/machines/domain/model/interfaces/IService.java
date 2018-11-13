package com.esdrasmorais.machines.domain.model.interfaces;

import java.util.List;

import com.esdrasmorais.machines.domain.model.Forecast;
import com.esdrasmorais.machines.domain.model.Machine;
import com.esdrasmorais.machines.domain.model.Schedule;

public interface IService {
	public void setType(String serviceType);
	public void setIsActive(Boolean isActive);
	public void setAverageCost(Double cost);
	public void setSchedules(List<Schedule> schedules);
	public void setForecasts(List<Forecast> forecasts);
	public void setMachine(Machine machine);	
}
