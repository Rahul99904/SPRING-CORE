package com.springcore.autowire_annot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test_auto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowire_annot/config.xml");
	Emp em=(Emp)context.getBean("emp1");
	System.out.println(em);
	}

}
