package com.nt.test;

import org.junit.jupiter.api.Test;

import com.nt.service.Arithmetic;

public class AppTest {

	@Test
	public void testPositives() {
		 Arithmetic ar =new  Arithmetic();
		 
		 int expected = 40;
		 
		 int actual = ar.sum(expected, expected);
	
	
	}
	
	
	
}
