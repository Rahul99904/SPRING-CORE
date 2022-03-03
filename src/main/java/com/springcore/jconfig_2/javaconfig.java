package com.springcore.jconfig_2;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@Configurable
public class javaconfig {
	
	@Bean
	public address getadd() {
		address ad=new address();
		return ad;
	}
	
	@Bean
	public Student getstud() {	
		Student st=new Student();
		return st;
	}

}
