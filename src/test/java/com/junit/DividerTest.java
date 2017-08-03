package com.junit;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import JavaTraining.JAVA_TRAINING.Divider;
public class DividerTest {
	
	
	@Test
	public void testDivide() {
		Divider divider = new Divider();
		assertEquals(5.0,divider.divide(10,2),0);
		assertEquals(6.0,divider.divide(12,2),0);
		assertEquals(7.0,divider.divide(14,2),0);
		assertEquals(8.0,divider.divide(16,2),0);
		assertEquals(9.0,divider.divide(18,2),0);
	}
}
