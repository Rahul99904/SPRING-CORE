package com.springcore.autowire_xml;

public class Emp {
private Address add1;

public Address getAdd1() {
	return add1;
}

public void setAdd1(Address add1) {
	this.add1 = add1;
}


 public Emp(Address add2) {
	super();
	this.add1 = add2;
}

@Override
 public String toString() 
 { 
	 return "Emp [add1=" + add1 + "]"; 
	 }

}
