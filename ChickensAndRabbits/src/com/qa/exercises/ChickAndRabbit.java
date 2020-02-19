package com.qa.exercises;

public class ChickAndRabbit {

	public void chickAndRabbit(int heads, int legs) {

		int rabbit = (legs / 2) - heads;
		System.out.println("The number of rabbits is: " + rabbit);
		int chicken = heads - rabbit;
		System.out.println("The number of chickens is: " + chicken);
	}

}
