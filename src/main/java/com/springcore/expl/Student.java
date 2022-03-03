package com.springcore.expl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("Rahul_Mangalarapu")
	private String name;
	
	@Value("#{20+3}")
	private int age;
	
	@Value("#{20+10+20+10}")
	private int ttl_marks;
	
	@Value("#{new com.springcore.expl.Placement()}")
	private Placement place_com;
	
	
	  @Value("#{ T(com.springcore.expl.Placement).inp_com_loc('Mumbai')}") /*Note:- The method to be used should be static method*/
	  private String comp_locc;
	  
	  @Value("#{ T(com.springcore.expl.Placement).com_noo}")
	  private double com_no;
	  
	  public double getCom_no() {
		return com_no;
	}

	public void setCom_no(double com_no) {
		this.com_no = com_no;
	}

	public String getComp_locc() { 
		  return comp_locc; 
		  }
	  
	  public void setComp_locc(String comp_locc) {
		  this.comp_locc = comp_locc;
		  }
	 
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Placement getPlace_com() {
		return place_com;
	}
	public void setPlace_com(Placement place_com) {
		this.place_com = place_com;
		
	}
	
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", ttl_marks=" + ttl_marks + ", place_com=" + place_com
				+ ", comp_locc=" + comp_locc + ", com_no=" + com_no + "]";
	}

	public int getTtl_marks() {
		return ttl_marks;
	}
	public void setTtl_marks(int ttl_marks) {
		this.ttl_marks = ttl_marks;
	}
	

}
