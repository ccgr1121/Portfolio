package com.qa.exercises;

public class Fibonacci {
	public int fibonacciSequence(Long num) {

		if (num == 0) {
			return 0;
		}
		if (num == 1) {
			return 1;
		}
		int firstPosition = 0;
		int nextPosition = 1;

		for (int i = 0; i < num - 1; i++) {
			int temp = firstPosition;
			firstPosition = nextPosition;
			nextPosition = firstPosition + temp;
		}
		System.out.println(nextPosition);
		return nextPosition;
	}
}
