package com.example.howmuch.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_troubleshoot")
public class Troubleshoot  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String productName;
	private Double appPrice;
	private Double storePrice;
	
	public Troubleshoot() {
	}

	public Troubleshoot(Long id, String productName, Double appPrice, Double storePrice) {
		super();
		this.id = id;
		this.productName = productName;
		this.appPrice = appPrice;
		this.storePrice = storePrice;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Troubleshoot other = (Troubleshoot) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
