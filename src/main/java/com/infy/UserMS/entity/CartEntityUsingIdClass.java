package com.infy.UserMS.entity;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public  class CartEntityUsingIdClass implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int buyerId;
	private int prodId;
	public CartEntityUsingIdClass(){
		
	}
	public CartEntityUsingIdClass(int buyerId,int prodId) {
		this.buyerId = buyerId;
		this.prodId = prodId;
	}
	public int getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	
	
}
