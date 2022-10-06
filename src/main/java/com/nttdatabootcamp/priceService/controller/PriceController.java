package com.nttdatabootcamp.priceService.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdatabootcamp.priceService.repository.Price;
import com.nttdatabootcamp.priceService.service.PriceService;

@RestController
public class PriceController {
	
	private PriceService priceService;
	
	public PriceController(PriceService priceService) {
		
		this.priceService = priceService;
			
	}
		
		
	@PostMapping(value = "/get-price/{id}")
	public Price getProducto(@PathVariable int id) {
		return priceService.getOnePrice(id);
		
	}
	
	@PostMapping(value = "/get-all-prices")
	public List<Price> postProducto() {
		return priceService.getAllPrices();
		
	}


}
