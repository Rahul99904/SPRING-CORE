package com.springcore.autowire_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test_auto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowire_xml/config.xml");
	Emp em=(Emp)context.getBean("emp1");
	System.out.println(em.getAdd1());
	}

}
