package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext cont=new AnnotationConfigApplicationContext(javaconfig.class);
	Student ss=(Student)  cont.getBean("stud");
		ss.student();
	}

}
