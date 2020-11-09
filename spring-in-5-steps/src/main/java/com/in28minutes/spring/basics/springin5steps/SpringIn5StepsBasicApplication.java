package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;

@SpringBootApplication
public class SpringIn5StepsBasicApplication {

	// What are the beans? => @Component
	// What are the dependencies of a bean? => @Autowired
	// Where to search for beans? => No need
	public static void main(String[] args) {
	
		//우리가 직접 빈을 만들어서 와이어링 한 버전
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		//Application Context
		
		// 스프링이 대신 와이어링 한 것
		ConfigurableApplicationContext applicationContext = 
				SpringApplication.run(SpringIn5StepsBasicApplication.class, args); //<- by default
		
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		
		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
		
		System.out.println(binarySearch);
		System.out.println(binarySearch1);
		
		int result = binarySearch.binarySearch(new int[] {12,4,6}, 3);
		System.out.println(result);
		//com.in28minutes.spring.basics.springin5steps.BubbleSortAlgorithm@43c67247
		//3

	}

}
