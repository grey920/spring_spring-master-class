package com.in28minutes.spring.basics.springin5steps;

public class BinarySearchImpl {
	// 구현체 대신 인터페이스를 사용한다 (-> 결합이 느슨해졌기 때문에 자유롭게 원하는 알고리즘을 선택할 수 있다)
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
