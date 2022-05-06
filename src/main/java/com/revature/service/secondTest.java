package com.revature.service;

import java.util.LinkedList;

public class secondTest {
	public static Character isListLooping(LinkedList<?> A, LinkedList<?> B) {
		
		LinkedList<Character> testedCharacters = new LinkedList<>();
		System.out.println("Perfroming the checks");
		
		for(int i = 0; i < A.size(); i++) {
			testedCharacters.add((Character) A.get(i));
		}
		
		for(int i = 0; i < B.size(); i++) {
			testedCharacters.add((Character) B.get(i));
		}
		
		char characterToTest = (char) A.get(2);
		
		for(int i = 1; i < A.size(); i++) {
			if(characterToTest == testedCharacters.get(i)) {
				return testedCharacters.get(i);
			}
		}
		return null;
	}
}
