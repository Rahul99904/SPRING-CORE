package com.springcore.jconfig_2;

import org.springframework.stereotype.Component;


public class Student {
	
	private address add;
	
	

	public address getAdd() {
		return add;
	}

	public void setAdd(address add) {
		this.add = add;
	}
	
	public void show_address(address ady) {
		setAdd(ady);
		add.display();
	}

	public void studen() {
		System.out.println("Student met onn");
	}

}
