package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	// What are the beans?
	// What are the dependencies of a bean?
	// Where to search for beans?
	public static void main(String[] args) {
	
		// 느슨한 결합 (생성자를 통한 주입)
		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		
		int result = binarySearch.binarySearch(new int[] {12,4,6}, 3);
		
		System.out.println(result);

		//SpringApplication.run(SpringIn5StepsApplication.class, args);
	}

}
