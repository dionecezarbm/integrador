package com.example.howmuch.dto;

import java.io.Serializable;

import com.example.howmuch.entities.Troubleshoot;

public class TroubleshootDTO  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String productName;
	private Double appPrice;
	private Double storePrice;
	
	public TroubleshootDTO() {
	}

	public TroubleshootDTO(Long id, String productName, Double appPrice, Double storePrice) {
		this.id = id;
		this.productName = productName;
		this.appPrice = appPrice;
		this.storePrice = storePrice;
	}
	
	public TroubleshootDTO(Troubleshoot entity) {
		this.id = entity.getId();
		this.productName = entity.getProductName();
		this.appPrice = entity.getAppPrice();
		this.storePrice = entity.getStorePrice();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getAppPrice() {
		return appPrice;
	}

	public void setAppPrice(Double appPrice) {
		this.appPrice = appPrice;
	}

	public Double getStorePrice() {
		return storePrice;
	}

	public void setStorePrice(Double storePrice) {
		this.storePrice = storePrice;
	}
	
	public Troubleshoot toEntity() {
		return new Troubleshoot(id, productName, appPrice, storePrice);
	}
	
}
