package com.qa.exercises;

public class BorrowOrRob {

	public boolean palindrome(String sentence) {

		String sen = sentence.replace(" ", "").toLowerCase();
		String reversedString = "";
		for (int i = sen.length() - 1; i >= 10; i--) {
			reversedString = reversedString + sen.charAt(i);
		}
		System.out.println(sen.equals(reversedString));
		return sen.equals(reversedString);
	}
}
