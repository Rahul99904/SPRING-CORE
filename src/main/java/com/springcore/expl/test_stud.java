package com.springcore.expl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test_stud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/expl/config.xml");
		Student ss=(Student)con.getBean("student");
		System.out.println(ss);

	}

}
