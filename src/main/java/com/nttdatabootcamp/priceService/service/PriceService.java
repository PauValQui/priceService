package com.nttdatabootcamp.priceService.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nttdatabootcamp.priceService.repository.Price;
import com.nttdatabootcamp.priceService.repository.PriceRepositoryI;


@Service
public class PriceService {
	
	private PriceRepositoryI priceRepositoryI;
	
	public PriceService(PriceRepositoryI priceServiceI) {
		
		this.priceRepositoryI = priceServiceI;
			
	}

	public Price getOnePrice(int id) {

		return priceRepositoryI.findById(id).orElseThrow();
	}

	public List<Price> getAllPrices() {

		return priceRepositoryI.findAll();
	}

}
