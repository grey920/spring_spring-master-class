package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	// 1. Autowiring by name
	@Autowired
	private SortAlgorithm bubbleSortAlgorithm;

	public int binarySearch(int[] numbers, int numberToSearchFor) {
		
		int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
		System.out.println(bubbleSortAlgorithm);
	
		// Search the array
		
		return 3;
	}
}
