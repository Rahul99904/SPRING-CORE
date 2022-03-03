package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
	@Value("Rahul")
	private String name;
	@Value("Mumbai")
	private String city;
	@Value("#{pno_list}")
	private List<Integer> pno;

	public List<Integer> getPno() {
		return pno;
	}

	public void setPno(List<Integer> pno) {
		this.pno = pno;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", pno=" + pno + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
	

}
