package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        @SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		
		Student std=(Student) context.getBean("student3");
		System.out.println(std);
		 
        
        Employee emp=(Employee)context.getBean("emp_col1");
        System.out.println(emp.getEmp_name());
        System.out.println(emp.getPhone());
        System.out.println(emp.getAddress());
        System.out.println(emp.getCourses());
        System.out.println(emp.getClass());

    }
}
