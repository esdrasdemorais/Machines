package com.esdrasmorais.machines.infrastructure.interfaces;

import java.util.List;

import com.esdrasmorais.ddd.repository.interfaces.IRepository;
import com.esdrasmorais.machines.domain.model.Machine;

public interface IMachineRepository extends IRepository<Machine> {
	public List<Machine> findByProduct(String product);
}