package com.Bean;

public class Category {
	public int cid;
	public String cname;
	public Category(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname=cname;
	}
	@Override
	public String toString() {
		return "Category [" + cid + "  " + cname + "]";
	}
	
	
	

}
