package com.fernandesjose.dsmeta.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fernandesjose.dsmeta.entities.Sale;
import com.fernandesjose.dsmeta.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleResources {
	
	@Autowired
	private SaleService services;
	
	@GetMapping
	public ResponseEntity<Page<Sale>> findAll(@RequestParam(value = "minDate", defaultValue = "") String minDate,
			@RequestParam(value = "maxDate", defaultValue = "") String maxDate, Pageable pageable){
		Page<Sale> page = services.findAll(minDate, maxDate, pageable);
		return ResponseEntity.ok().body(page);
	}

}
