package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.in28minutes.spring.basics.springin5steps.scope.PersonDAO;

/*	Go4 의 싱글톤과 스프링의 싱글톤의 차이점
 * - Go4의 싱글톤 패턴은 여러개의 application context가 있더라도, JVM 당 하나의 단 하나의 특정 클래스의 인스턴스가 생성된다. 
 * - 스프링의 싱글톤은 application context 당 하나의 특정 클래스의 인스턴스가 생성된다.  
 * 만약에 다섯개의 application context가 하나의 JVM 위에서 동작하고 있다면, 
 * 스프링 빈이 싱글톤 스코프일때 다섯개의 인스턴스를 가지게 된다.
 * 하지만, GoF의 싱글톤 디자인 패턴이라면 오직 하나의 인스턴스만을 가지게 된다.  
*/

@SpringBootApplication
public class SpringIn5StepsScopeApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class); 
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = 
				SpringApplication.run(SpringIn5StepsScopeApplication.class, args);
		
		PersonDAO personDao = applicationContext.getBean(PersonDAO.class);
		
		PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);
	
		LOGGER.info("{}", personDao);
		LOGGER.info("{}", personDao.getJdbcConnection());// 같은 personDao 인스턴스이지만 JdbcConnection의 proxy로 인해 
		LOGGER.info("{}", personDao.getJdbcConnection());// 매번 다른 JdbcConnection 인스턴스를 호출한다
		
		LOGGER.info("{}", personDao2);
		LOGGER.info("{}", personDao2.getJdbcConnection());
	}

}
