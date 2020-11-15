package com.in28minutes.spring.basics.springin5steps.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

// 데이터베이스로부터 데이터를 가져오므로 Repository어노테이션을 붙인다.
@Repository
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
