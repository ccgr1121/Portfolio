package com.qa.exercises;

public class Finder {
	public Boolean find(String s, int i, char c) {
		return (s.charAt(i - 1) == c);
	}
}