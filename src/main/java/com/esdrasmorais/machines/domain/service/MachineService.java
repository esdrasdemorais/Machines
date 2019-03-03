package com.esdrasmorais.machines.domain.service;

import java.util.List;

import com.esdrasmorais.ddd.service.Service;
import com.esdrasmorais.machines.domain.model.Machine;
import com.esdrasmorais.machines.domain.service.interfaces.IMachineService;
import com.esdrasmorais.machines.infrastructure.interfaces.IMachineRepository;

public class MachineService extends Service<Machine>
	implements IMachineService
{
	private final IMachineRepository machineRepository;
	
	public MachineService(IMachineRepository machineRepository) {
		super(machineRepository);
		this.machineRepository = machineRepository;
	}

	@Override
	public List<Machine> findByProduct(String product) {
		Object[] object = new Object[] { product };
		return this.machineRepository.find("product", object);
	}
}