package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/stereotype/config.xml");
		Student std=(Student)context.getBean("student");
		System.out.println(std);
		System.out.println(std.hashCode());
		Student std1=(Student)context.getBean("student");
		System.out.println(std1.hashCode());
	}
	

}
