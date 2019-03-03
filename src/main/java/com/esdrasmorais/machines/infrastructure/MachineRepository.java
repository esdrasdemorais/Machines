package com.esdrasmorais.machines.infrastructure;

import java.util.List;

import com.esdrasmorais.ddd.repository.MongoRepository;
import com.esdrasmorais.ddd.repository.interfaces.IClient;
import com.esdrasmorais.ddd.repository.interfaces.IContext;
import com.esdrasmorais.ddd.repository.interfaces.IDb;
import com.esdrasmorais.machines.domain.model.Machine;
import com.esdrasmorais.machines.infrastructure.interfaces.IMachineRepository;

public class MachineRepository extends MongoRepository<Machine>
	implements IMachineRepository
{
	public MachineRepository(IContext context, IClient client, IDb db) {
		super(context, client, db);
	}
	
	public List<Machine> findByProduct(String product) {
		return null;
	}
}