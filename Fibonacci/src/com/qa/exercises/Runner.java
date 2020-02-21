package com.qa.exercises;

public class Runner {
	public static void main(String[] args) {
		FibonacciTwo fibonacciTwo = new FibonacciTwo();
		fibonacciTwo.fibonacciTwo(40L);
			System.out.println(fibonacciTwo.fibonacciTwo(100L));
	
		Fibonacci fibonacci = new Fibonacci();
		fibonacci.fibonacciSequence(40L);
		System.out.println(fibonacci.fibonacciSequence(100L));
	}
}
