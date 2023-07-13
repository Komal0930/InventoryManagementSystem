package com.DAO;
import com.Bean.*;
import java.util.*;


public class ImplementationOfInventoryManagement implements InventoryManagementMethods {
	
     ArrayList<InventoryItem>al=new ArrayList<>();
     Scanner sc=new Scanner(System.in);
     
     public ImplementationOfInventoryManagement()
     {
    	 al=new ArrayList<>();
     }
     
	@Override
	public  ArrayList<InventoryItem> addProduct() {
		System.out.println("Enter the Category details..");
		System.out.println("Enter the category id");
		int cid=sc.nextInt();
		System.out.println("Enter category name");
		String cname=sc.next();
		Category c=new Category(cid,cname);
		System.out.println("Enter the no of products you want to add in this category...");
		int num=sc.nextInt();
		for (int i=0;i<num;i++)
		{
		System.out.println("Enter product details.........");
		System.out.println("Enter the product  id");
		int pid=sc.nextInt();
		System.out.println("Enter the product name");
		String pname=sc.next();
		System.out.println("Enter price of Product");
		double price=sc.nextDouble();
		Product p=new Product(pid,pname,price,c);
		
		System.out.println("Enter the quantity of product...");
		int q=sc.nextInt();
		InventoryItem iv=new InventoryItem(p,q);
		al.add(iv);
		
		
		}
		return al;
		//al.add(new InventoryItem(new Product (pid,pname,price ,new Category(cid,cname)), q));
	}

	
	
	@Override
	public void removeProduct() {
		//LinkedList<InventoryItem>ls=new LinkedList<>(al);
		
		System.out.println("Enter the product name you want to remove....");
		String rpname=sc.next();
		//HashMap<Integer,String>hm=new HashMap<>();
		Iterator<InventoryItem>it=al.iterator();
		while(it.hasNext())
		{
			InventoryItem i=it.next();
			
			if(i.pt.pname.equals(rpname))
			{
			    it.remove();
				System.out.println("Deleted sucessfully...");
			}
			
		}
		
		//System.out.println(al);
		
	}

	@Override
	public void updateStockLevelOfProduct() {
		System.out.println("Enter the product name you want to update stock level for that.. ");
		String pname=sc.next();
		System.out.println("Enter the new quantity for product.");
		int q=sc.nextInt();
		Iterator<InventoryItem>it=al.iterator();
		while(it.hasNext())
		{
			InventoryItem i=it.next();
			if(i.pt.pname.equals(pname))
			{
				i.quantity=q;
			}
		}
		
		
	}

	@Override
	public ArrayList<InventoryItem>  displayListOfProducts() {
		Iterator<InventoryItem>it=al.iterator();
		
		while(it.hasNext())
		{
			InventoryItem i=it.next();
			System.out.println(i);
		}
		return al;
	}

	@Override
	public void displayValueOfProduct() {
		HashMap<String,Integer>hm=new HashMap<>();
		
		Iterator<InventoryItem>it=al.iterator();
		while(it.hasNext())
		{
			InventoryItem i=it.next();
			String product_name=i.pt.pname;
			int price=(int) i.pt.price;
			int quantity=i.quantity;
			if(hm.containsKey(product_name))
			{
				int p=hm.get(product_name);
				int val=(p+price)*quantity;
				hm.put(product_name, val);
			}
			else
			{
				int val=price*quantity;
				hm.put(product_name, val);
			}
		}
		System.out.println(hm);
		
		
	}

	@Override
	public void searchProduct() {
		System.out.println("Enter product name");
		String pname=sc.next();
		LinkedList<InventoryItem>ls=new LinkedList<>(al);
		Iterator<InventoryItem>it=ls.iterator();
		boolean ispresent=false;
		while(it.hasNext())
		{
			InventoryItem i=it.next();
			if(i.pt.pname.equals(pname))
			{
				ispresent=true;
			}
			if (ispresent==true)
			{
				System.out.println(i);
			}
			else if (ispresent==false)
			{
				System.out.println("Product is not present..");
			}
			
		}
		
	}
	
	

}
