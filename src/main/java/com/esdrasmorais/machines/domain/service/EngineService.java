package com.esdrasmorais.machines.domain.service;

import java.util.List;

import com.esdrasmorais.ddd.service.Service;
import com.esdrasmorais.machines.domain.model.Engine;
import com.esdrasmorais.machines.domain.service.interfaces.IEngineService;
import com.esdrasmorais.machines.infrastructure.interfaces.IEngineRepository;

public class EngineService extends Service<Engine>
	implements IEngineService
{
	private final IEngineRepository engineRepository;
	
	public EngineService(IEngineRepository engineRepository) {
		super(engineRepository);
		this.engineRepository = engineRepository;
	}

	@Override
	public List<Engine> findByBrand(String brand) {
		Object[] object = new Object[] { brand };
		return this.engineRepository.find("brand", object);
	}
}