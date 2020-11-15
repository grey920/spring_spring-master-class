package com.in28minutes.spring.basics.springin5steps.xml;

public class XmlPersonDAO {
	
	// 디펜던시를 XMLJdbcConnection으로 변경하고 getter, setter 생성
	XmlJdbcConnection xmljdbcConnection; 

	public XmlJdbcConnection getXmlJdbcConnection() {
		return xmljdbcConnection;
	}

	public void setXmlJdbcConnection(XmlJdbcConnection jdbcConnection) {
		this.xmljdbcConnection = jdbcConnection;
	}
	
	
}
