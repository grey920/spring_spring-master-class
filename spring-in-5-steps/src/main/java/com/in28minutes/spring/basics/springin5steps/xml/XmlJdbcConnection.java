package com.in28minutes.spring.basics.springin5steps.xml;

import org.springframework.stereotype.Component;

// XMLPersonDAO와 연결.
// 전에 있던 애노테이션 전부 제거
@Component
public class XmlJdbcConnection {
	// 생성자
	public XmlJdbcConnection() {
		System.out.println("Jdbc Connection");
	}
}
