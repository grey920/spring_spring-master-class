package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
		/*
		 * The objective is understand the concepts of tight coupling and dependency
		 * injection
		 */
		
		// if you wanna change quickSort all that i need to do is change it here.
		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		
		int result = binarySearch.binarySearch(new int[] {12,4,6}, 3);
		//com.in28minutes.spring.basics.springin5steps.BubbleSortAlgorithm@7de26db8
		
		System.out.println(result);

		//SpringApplication.run(SpringIn5StepsApplication.class, args);
	}

}
