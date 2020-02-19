package com.qa.uniqueLetter;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueLetter {
	
	public String uniqueLetters(String sentence) {
		
		Set<Character> uniqueLetterList = new LinkedHashSet<Character>();
		String uniqueLetters = "";
		for(int i=0; i<sentence.length();i++) {
			uniqueLetterList.add(sentence.charAt(i));
		}
		for(char c : uniqueLetterList) {
			uniqueLetters = uniqueLetters +c;
		}
		System.out.println(uniqueLetters);
		return uniqueLetters;	
		
//		return Arrays.asList(sentence.split("")).stream().distinct().collect(Collectors.joining(""));
		
	}

}
