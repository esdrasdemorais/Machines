package com.esdrasmorais.machines.domain.service;

import java.util.List;

import com.esdrasmorais.ddd.service.IService;
import com.esdrasmorais.machines.domain.model.Engine;

public interface IEngineService extends IService<Engine> {
	public List<Engine> findByBrand(String brand);
}
