package com.qa.exercises;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class fibonacciTest {
	@Test
	public void recursionTest() {
		Fibonacci fibonacci = new Fibonacci();
		assertEquals(102334155, fibonacci.fibonacciSequence(100L));
	}
	
	@Test
	public void iterationTest() {
		FibonacciTwo fibonacciTwo = new FibonacciTwo();
		assertEquals(102334155, fibonacciTwo.fibonacciTwo(100L));
	}
}
