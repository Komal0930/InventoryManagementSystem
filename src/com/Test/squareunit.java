package com.Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class squareunit {

	@Test
	public void test() {
		UnitTesting onj=new UnitTesting();
		int o=onj.square(4);
		
		// test outpt
		assertEquals(16,o);
		
	}

}
