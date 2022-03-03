package com.springcore.lifecyc;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class lyc2 implements InitializingBean,DisposableBean{
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting lyc2_price");
		this.price = price;
	}

	@Override
	public String toString() {
		return "lyc2 [price=" + price + "]";
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy:lyc2");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initialize:lyc2");
		
	}
}
