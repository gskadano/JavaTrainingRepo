package com.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import JavaTraining.JAVA_TRAINING.Modulo;

public class TestModulo {

	@Test
	public void testModulo() {
		assertEquals(0,Modulo.modulo(10,2),0);
		assertEquals(0,Modulo.modulo(12,2),0);
		assertEquals(0.0,Modulo.modulo(14,2),0);
		assertEquals(0.0,Modulo.modulo(16,2),0);
		assertEquals(0.0,Modulo.modulo(18,2),0);
	}

}
