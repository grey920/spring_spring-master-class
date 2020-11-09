package com.in28minutes.spring.basics.springin5steps.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PersonDAO {
	
	@Autowired
	JdbcConnection jdbcConnection; //JdbcConnection 클래스의 scope를 prototype으로 주었어도 같은 인스턴스를 리턴한다. 
								// 매번 다른 객체를 부르고 싶다면? -> 프록시를 이용한다. 

	public JdbcConnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(JdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}
	
	
}
