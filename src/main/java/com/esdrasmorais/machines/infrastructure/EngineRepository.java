package com.esdrasmorais.machines.infrastructure;

import java.util.List;

import com.esdrasmorais.ddd.repository.MongoRepository;
import com.esdrasmorais.ddd.repository.interfaces.IClient;
import com.esdrasmorais.ddd.repository.interfaces.IContext;
import com.esdrasmorais.ddd.repository.interfaces.IDb;
import com.esdrasmorais.machines.domain.model.Engine;
import com.esdrasmorais.machines.infrastructure.interfaces.IEngineRepository;

public class EngineRepository extends MongoRepository<Engine>
	implements IEngineRepository
{
	public EngineRepository(IContext context, IClient client, IDb db) {
		super(context, client, db);
	}

	public List<Engine> findByBrand(String brand) {
		return null;
	}
}