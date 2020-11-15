package com.in28minutes.spring.basics.springin5steps;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in28minutes.spring.basics.springin5steps.xml.XmlPersonDAO;

// Spring에서 application context를 정의할 때 @Configuration을 사용함
@Configuration
@ComponentScan
public class SpringIn5StepsXMLContextApplication {
	public static void main(String[] args) {

		// xml설정 파일을 이용해서 실행하기 - ClassPathXmlApplicationContext 이용
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml")) {

			XmlPersonDAO personDao = applicationContext.getBean(XmlPersonDAO.class);
			System.out.println(personDao);
			System.out.println(personDao.getXmlJdbcConnection()); // auto-wiring 잘 됐는지 확인
		}
	}

}
