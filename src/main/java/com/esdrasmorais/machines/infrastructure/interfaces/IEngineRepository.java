package com.esdrasmorais.machines.infrastructure.interfaces;

import java.util.List;

import com.esdrasmorais.ddd.repository.interfaces.IRepository;
import com.esdrasmorais.machines.domain.model.Engine;

public interface IEngineRepository extends IRepository<Engine> {
	public List<Engine> findByBrand(String brand);
}