package com.pack1;

public class Constructor {
	int id;   
	String name;  
	long z1;
	String d1;
	
	
		
	public Constructor() 
	{
		id=28;
		name = "hello";
		z1=44387564387L;
		d1="helloworld";
		
		System.out.println("inside the default constructor");
	}
	
	void display() 
	{
		System.out.println(id+" "+name);
		System.out.println("name is:"+name);
		System.out.println("long value is:"+z1);
		System.out.println("string2 is :"+d1);
	}  
	public static void main(String[] args) 
	{
		Constructor c1=new Constructor();
		c1.display();
		
	}

}