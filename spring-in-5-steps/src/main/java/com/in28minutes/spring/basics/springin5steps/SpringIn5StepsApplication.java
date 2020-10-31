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
		
		BinarySearchImpl binarySearch = new BinarySearchImpl();
		int result = binarySearch.binarySearch(new int[] {12,4,6}, 3);
		System.out.println(result);

		SpringApplication.run(SpringIn5StepsApplication.class, args);
	}

}
