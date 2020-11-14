package com.in28minutes.spring.basics.springin5steps;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;

// Spring에서 application context를 정의할 때 @Configuration을 사용함
@Configuration
//@ComponentScan만 쓰면 현재 패키지를 컴포넌트 스캔. 
@ComponentScan("com.in28minutes.spring.basics.springin5steps")
public class SpringIn5StepsBasicApplication {

	// What are the beans? => @Component
	// What are the dependencies of a bean? => @Autowired
	// Where to search for beans? => No need
	public static void main(String[] args) {

		try(AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class)) {

		BinarySearchImpl binarySearch = applicationContext
				.getBean(BinarySearchImpl.class);

		BinarySearchImpl binarySearch1 = applicationContext
				.getBean(BinarySearchImpl.class);

		System.out.println(binarySearch);
		System.out.println(binarySearch1);

		int result = binarySearch.binarySearch(new int[] { 12, 4, 6 }, 3);
		System.out.println(result);
		applicationContext.close();
		}
	}

}
