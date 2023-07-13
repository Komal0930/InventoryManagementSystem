package com.Bean;

public class InventoryItem {
	public Product pt;
	public int quantity;
	public InventoryItem(Product pt, int quantity) {
		super();
		this.pt = pt;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "InventoryItem [ " + pt + "  " + quantity + "]";
	}
	
	

}
