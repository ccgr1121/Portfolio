package com.qa.exercises;

public class FizzBuzz {

	public String FizzBuzz(int arg) {
		String answer = "";
		if(arg %3 == 0) {
			answer += "fizz";
		}if(arg %5 == 0) {
			answer += "Buzz";
		}if(arg %7 == 0) {
			answer += "Pop";
		}if(arg %11 == 0) {
			answer += "Snap";
		}
		System.out.println(answer);
	return answer;

	}

}
