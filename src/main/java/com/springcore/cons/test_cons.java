package com.springcore.cons;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class test_cons {

	public static void main(String[] args) {
		
	ApplicationContext context=	new ClassPathXmlApplicationContext("com/springcore/cons/config.xml");
	context.getBean("addi");
	
	}

}
