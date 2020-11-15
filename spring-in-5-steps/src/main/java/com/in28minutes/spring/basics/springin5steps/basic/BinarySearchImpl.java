package com.in28minutes.spring.basics.springin5steps.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
// 비즈니스 로직이므로 @Service를 사용한다.
@Service
public class BinarySearchImpl {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	@Qualifier("bubble")
	private SortAlgorithm sortAlgorithm;

	public int binarySearch(int[] numbers, int numberToSearchFor) {
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		// Search the array
		return 3;
	}
//	
//	@PostConstruct
//	public void postConstruct() {
//		logger.info("postConstruct");
//	}
//	
//	@PreDestroy
//	public void preDestroy() {
//		logger.info("preDestroy");
//	}
}
