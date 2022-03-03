package com.springcore.cons;

public class addition {
	

	private int a;
	private int b;
	private oj obj;
	
	public addition(int a,int b, oj obb) {
		this.a=a;
		this.b=b;
		this.obj=obb;
		obj.setA("Checkk_int");
		
		System.out.println(a +"   "+b);
	 System.out.println("Int cons  "+(a+b)+"  Object_a "+ this.obj.getA());
	
	}
	
	public addition(double a, double  b,oj obb) 
	{
		this.a=(int)a;
		this.b=(int)b;
		this.obj=obb;
		obj.setA("Checkk_dbl");
		
		System.out.println(a +"   "+b);
		System.out.println("Double cons  "+(a+b)+"  Object_a "+ this.obj.getA());
	}
	
	public addition(String a, String  b,oj obb) 
	{
		this.a=Integer.parseInt(a);
		this.b=Integer.parseInt(b);
		this.obj=obb;
		obj.setA("Checkk_str");
		
		System.out.println(a +"   "+b);
		System.out.println("String cons  "+(a+b) +"  Object_a "+ this.obj.getA());
	}
	
	public addition() {
		System.out.println("Default Cons");
	}
	
	

}
