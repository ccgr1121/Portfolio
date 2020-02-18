package com.qa.exercises;

public class Factorials {
	public int factorials(int i) {
		int factorial = i;
		for(int j=1; j>0; j--){
			factorial = factorial*j;
		}return factorial;
	}
}
