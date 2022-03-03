package com.springcore.lifecyc;

public class lyc1 {
	private double price;

	

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price");
		this.price = price;
	}

	@Override
	public String toString() {
		return "lyc1 [price=" + price + "]";
	}
	public void init() {
		System.out.println("This is initialization Code");
		
	}
	
	public void destroy() {
		System.out.println("This is destruction Code");
	}
	
}
