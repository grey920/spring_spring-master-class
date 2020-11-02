package com.in28minutes.spring.basics.springin5steps;

import org.springframework.stereotype.Component;

//1. 스프링에게 BinarySearchImpl이 빈이라고 알려준다 (by adding @Component)
@Component
public class BinarySearchImpl {
	private SortAlgorithm sortAlgorithm;
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}

	public int binarySearch(int[] numbers, int numberToSearchFor) {
		
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
	
		// Search the array
		
		return 3;
	}
}
