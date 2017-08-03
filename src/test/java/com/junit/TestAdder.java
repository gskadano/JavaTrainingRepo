package com.junit;

import org.junit.Test;

import JavaTraining.JAVA_TRAINING.Adder;
import junit.framework.TestCase;

public class TestAdder extends TestCase {
	@Test
	public void testAdder() {
		Adder add = new Adder();
		assertEquals(3.0,add.add(1, 2),0);
		assertEquals(5.0,add.add(3, 2),0);
		assertEquals(7.0,add.add(5, 2),0);
	}
}
