package com.Bean;

import java.util.ArrayList;
import java.util.Iterator;

public class Product {
	public int pid;
	public String pname;
	public double price;
	public Category cat;
	
	public Product(int pid, String pname, double price, Category cat) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.cat = cat;
	}

	@Override
	public String toString() {
		return "Product [" + pid + "  " + pname + " " + price + " " + cat + "]";
	}
	
	

}

