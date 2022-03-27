package com.admilson.xjrvendas.dto;

import java.io.Serializable;

import com.admilson.xjrvendas.entities.Seller;

public class SaleSuccessDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String sellerName;
	private Long visted;
	private Long deals;
	
	public SaleSuccessDTO() {
		
	}

	public SaleSuccessDTO(Seller seller, Long visted, Long deals) {
		sellerName = seller.getName();
		this.visted = visted;
		this.deals = deals;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Long getVisted() {
		return visted;
	}

	public void setVisted(Long visted) {
		this.visted = visted;
	}

	public Long getDeals() {
		return deals;
	}

	public void setDeals(Long deals) {
		this.deals = deals;
	}
	
}
