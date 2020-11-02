package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	// What are the beans? => @Component
	// What are the dependencies of a bean? => @Autowired
	// Where to search for beans? => No need
	public static void main(String[] args) {
	
		//스프링이 알아서 만들어 줘서 필요없다.
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		//Application Context
		ConfigurableApplicationContext applicationContext = 
				SpringApplication.run(SpringIn5StepsApplication.class, args); //<- by default
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] {12,4,6}, 3);
	}

}
