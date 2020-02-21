package com.qa.exercises;

public class Primes {
	int primeNumbers(int max) {
		int primeCOunter = 0;
		for (int i = 2; i <= max; i++) {
			boolean isPrime = true;
			for (int j = 2; j <= (int) Math.sqrt(j); j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
		return isPrime;
		}
	}
}
