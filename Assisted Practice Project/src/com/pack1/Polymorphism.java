package com.pack1;

public class Polymorphism {
	
	    public int sum(int x, int y) 
	    { 
	        return (x + y); 
	    } 
	    public int sum(int x, int y, int z) 
	    { 
	        return (x + y + z); 
	    } 
	    public double sum(double x, double y) 
	    { 
	        return (x + y); 
	    } 
	    public static void main(String args[]) 
	    { 
	    	Polymorphism s = new Polymorphism(); 
	        System.out.println(s.sum(40, 50)); 
	        System.out.println(s.sum(19, 25, 45)); 
	        System.out.println(s.sum(16.5, 58.5)); 
	    } 
	}