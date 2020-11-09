package com.in28minutes.spring.basics.springin5steps.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, // 매번 새로운 JDBC Connection을 원하기 때문에 prototype
proxyMode = ScopedProxyMode.TARGET_CLASS) //JdbcConnection이 쓰이는 모든 곳에 프록시를 사용한다는 뜻
public class JdbcConnection {
	public JdbcConnection() {
		System.out.println("Jdbc Connection");
	}
}
