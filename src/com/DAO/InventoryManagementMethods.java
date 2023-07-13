package com.DAO;

import java.util.ArrayList;

import com.Bean.InventoryItem;

public interface InventoryManagementMethods {
	public ArrayList<InventoryItem> addProduct();
	void removeProduct();
	void updateStockLevelOfProduct();
	ArrayList<InventoryItem> displayListOfProducts();
	void displayValueOfProduct();
	void searchProduct();

}
