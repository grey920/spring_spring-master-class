package com.in28minutes.spring.basics.springin5steps;

public class BinarySearchImpl {
	
	// bubbleSortAlgorithm에서 QuickSortAlgorithm으로 바꾸고 싶을때?? => Interface 이용하기
	public int binarySearch(int[] numbers, int numberToSearchFor) {

		BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
		
		int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
	
		// Search the array
		
		return 3;
	}
}
