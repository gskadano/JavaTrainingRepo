package com.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import JavaTraining.JAVA_TRAINING.Power;

public class TestPower {
	@Test
	public void testPower() {
		Power x = new Power();
		double result = x.getMultiply(4, 4);
		assertEquals(256.0, result, 0);
	}

}
