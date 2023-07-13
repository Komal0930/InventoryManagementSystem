package com.Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	
	@SuppressWarnings("deprecation")
	public void testDivision()
	{
		assertEquals(2,Calculator.division(4, 2));
	}
       
    		   
	@Test
	public void testAddition() {
		assertEquals(6,Calculator.addition(3,3));
		
	}

	@Test
	public void testSubstraction() {
		assertEquals(6,Calculator.substraction(9, 3));
	}

	@Test
	public void testMultiplication() {
		assertEquals(9,Calculator.multiplication(3, 3));
	}

	

}
