package com.fernandesjose.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fernandesjose.dsmeta.entities.Sale;
import com.fernandesjose.dsmeta.repositories.SaleRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repo;
	
	public List<Sale> findAll(){
		List<Sale> list = repo.findAll();
		return list;
	}

}
