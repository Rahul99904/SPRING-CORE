package com.springcore.expl;

public class Placement {

	private String company;
	private static  String com_loc;
	
	public  static double com_noo=20214;
	 
	 
public static String inp_com_loc(String com_locc) { 
		  com_loc = com_locc;
		  return com_loc; 
		  }
	 

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
}
