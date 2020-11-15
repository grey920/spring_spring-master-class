package com.in28minutes.spring.basics.springin5steps.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class XmlPersonDAO {
	
	// 디펜던시를 XMLJdbcConnection으로 변경하고 getter, setter 생성
	@Autowired
	XmlJdbcConnection xmljdbcConnection; 

	public XmlJdbcConnection getXmlJdbcConnection() {
		return xmljdbcConnection;
	}

	public void setXmlJdbcConnection(XmlJdbcConnection jdbcConnection) {
		this.xmljdbcConnection = jdbcConnection;
	}
	
	
}
