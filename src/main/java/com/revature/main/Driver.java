package com.revature.main;

import java.util.LinkedList;
import com.revature.service.*;

public class Driver {
	public static void main(String[] args) {
		
		LinkedList<Character> first = new LinkedList<>();
		LinkedList<Character> second = new LinkedList<>();
		
		first.add('A');
		first.add('B');
		first.add('C');
		
		second.add('D');
		second.add(first.get(2));
		
		System.out.println("Checking for intersection: ");
		
		Character intersectResult = firstTest.isListIntersected(first, second);
		if(intersectResult == null) {
			System.out.println("There was no intersection found");
		}
		else {
			System.out.println("The intersected character was " + intersectResult);
		}
		
		System.out.println("");
		System.out.println("Checking for looping: ");
		
		Character loopResult = secondTest.isListLooping(first, second);
		if(loopResult == null) {
			System.out.println("There was no loop found");
		}
		else {
			System.out.println("The looped character was " + loopResult);
		}
	}
}
