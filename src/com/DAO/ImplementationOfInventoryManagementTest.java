package com.DAO;

import static org.junit.Assert.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import com.Bean.InventoryItem;

public class ImplementationOfInventoryManagementTest {
ArrayList<InventoryItem>al=new ArrayList<>();
	@Test
	public final void test() {
		ImplementationOfInventoryManagement im=new ImplementationOfInventoryManagement();
		assertEquals(Arrays.asList("1 soyabin 100.0 100 oil 500"),im.addProduct());
		assertEquals(Arrays.asList(al),im.displayListOfProducts());
		
	}

	

}
