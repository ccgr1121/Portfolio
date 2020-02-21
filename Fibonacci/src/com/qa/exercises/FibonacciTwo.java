package com.qa.exercises;

public class FibonacciTwo {
	int fibonacciTwo(Long num) {
		if (num == 0L) {
			return 0;
		} else if (num == 1L) {
			return 1;
		}
		return fibonacciTwo(num - 1) + fibonacciTwo(num - 2);
	}
}