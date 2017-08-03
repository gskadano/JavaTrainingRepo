package com.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import JavaTraining.JAVA_TRAINING.Multiply;

public class TestMultiple {

	@Test
	public void testMultiple() {
		assertEquals(1.0, Multiply.multiply(1.0,1.0), 0);
		assertEquals(3.84, Multiply.multiply(1.2,3.2), 0);
		assertEquals(4.2435, Multiply.multiply(1.23, 3.45), 0);
	}

}
