package com.fernandesjose.dsmeta.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fernandesjose.dsmeta.entities.Sale;
import com.fernandesjose.dsmeta.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleResources {
	
	@Autowired
	private SaleService services;
	
	@GetMapping
	public ResponseEntity<List<Sale>> findAll(){
		List<Sale> list = services.findAll();
		return ResponseEntity.ok().body(list);
	}

}
