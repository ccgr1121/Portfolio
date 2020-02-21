package com.qa.exercises;

import java.util.Arrays;

public class Anagrams {

	public boolean anagram(String a, String b) {

		char[] ar = a.toLowerCase().toCharArray();
		char[] br = b.toLowerCase().toCharArray();
		Arrays.sort(ar);
		Arrays.sort(br);
		System.out.println(Arrays.equals(ar,br));
		return Arrays.equals(ar,br);
	}
}

