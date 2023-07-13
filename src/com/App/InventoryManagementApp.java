package com.App;
import com.DAO.*;

import com.Bean.*;

import java.util.*;
public class InventoryManagementApp {

	public static void main(String[] args) {
		ArrayList<Product>list=new ArrayList<>();
		list.add(new Product (1,"Sunflower",120.25,new Category(100,"oil")));
		
		Scanner sc=new Scanner(System.in);
		ImplementationOfInventoryManagement im=new ImplementationOfInventoryManagement();
		char ch;
		do
		{
			System.out.println("Enter the choice from below ...");
			System.out.println("1.Add a new Product\n2. Remove a Product\n3. Update the stock level of a product\n4. Display List of all Products\n5. Display the total value of all products\n6. Search a product by name or category" );
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1: im.addProduct();
			break;
			case 2: im.removeProduct();
			break;
			case 3: im.updateStockLevelOfProduct();
			break;
			case 4: im.displayListOfProducts();
			break;
			case 5: im.displayValueOfProduct();
			break;
			case 6: im.searchProduct();
			break;
			default: System.out.println("Invalid choice");
			
			}
			System.out.println("Do you want to continue....");
			ch=sc.next().charAt(0);
			
		}
		while(ch=='y'||ch=='Y');
		{
			System.out.println("Thank You....");
		}
			
		

	}

}
