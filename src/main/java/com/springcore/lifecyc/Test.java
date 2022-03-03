package com.springcore.lifecyc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/lifecyc/config.xml");
		lyc1 lc1= (lyc1)context.getBean("lc1");
		System.out.println(lc1);
		
		lyc2 lc2=(lyc2)context.getBean("lc2");
		System.out.println(lc2);
		context.registerShutdownHook();
		
	}
}
