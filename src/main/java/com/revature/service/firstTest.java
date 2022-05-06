package com.revature.service;

import java.util.LinkedList;

public class firstTest {
	public static Character isListIntersected(LinkedList<?> A, LinkedList<?> B) {
		
		for(int i = 0; i < A.size(); i++) {
			for(int j = 0; j < B.size(); j++) {
				if(A.get(i) == B.get(j)) {
					return (Character) A.get(i);
				}
			}
		}
		return null;
	}
}
