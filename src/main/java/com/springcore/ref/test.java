package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[]args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ref/config_ref.xml");
		A a=(A)context.getBean("aref");
		System.out.println(a.getId_a());
		System.out.println(a.getObj().getId());
		System.out.println(a.getObj().getName());
		
	}
	
}
