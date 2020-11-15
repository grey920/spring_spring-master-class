package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in28minutes.spring.basics.springin5steps.xml.XmlPersonDAO;

public class SpringIn5StepsXMLContextApplication {

	private static Logger LOGGER = LoggerFactory
			.getLogger(SpringIn5StepsXMLContextApplication.class);

	public static void main(String[] args) {
		
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml")) {
			
			// 어떤 application context로부터 빈들이 실행되는지 알아낸다. 
			LOGGER.info("Beans Loaded -> {}", 
					(Object)applicationContext.getBeanDefinitionNames() );
			// Beans Loaded -> [xmlJdbcConnection, xmlPersonDAO] 

			XmlPersonDAO personDao = applicationContext.getBean(XmlPersonDAO.class);
		
			LOGGER.info("{} {}", 
					personDao, personDao.getXmlJdbcConnection());
		}
	}

}
