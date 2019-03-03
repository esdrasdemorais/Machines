package com.esdrasmorais.machines.domain.service.interfaces;

import java.util.List;

import com.esdrasmorais.ddd.service.IService;
import com.esdrasmorais.machines.domain.model.Machine;

public interface IMachineService extends IService<Machine> {
	public List<Machine> findByProduct(String product);
}