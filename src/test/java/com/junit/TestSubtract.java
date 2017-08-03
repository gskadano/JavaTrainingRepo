package com.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Assert.*;

import JavaTraining.JAVA_TRAINING.Subtracter;

public class TestSubtract {
	@Test
	public void testSubtract() {
		// TODO Auto-generated constructor stub
		Subtracter sub = new Subtracter();
		assertEquals(1.0, sub.subtract(2, 1), 0);
	}

}
