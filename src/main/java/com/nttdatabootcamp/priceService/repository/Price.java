package com.nttdatabootcamp.priceService.repository;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "price")
public class Price {
	
	@Id
	@GeneratedValue
	public Integer id;
	
	@Column(name = "code_product")
	public String code_product;
	
	@Column(name = "description")
	public String description;
	
	@Column(name = "price")
	public BigDecimal price;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode_product() {
		return code_product;
	}

	public void setCode_product(String code_product) {
		this.code_product = code_product;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	
	
}