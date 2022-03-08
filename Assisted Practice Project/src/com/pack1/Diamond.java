package com.pack1;

interface First 
{  
    default void show() 
    { 
        System.out.println("Default First interface"); 
    } 
} 
interface Second 
{  
    default void show() 
    { 
        System.out.println("Default Second interface "); 
    } 
}  
public class Diamond implements First, Second 
{  
    public void show() 
    {  
        First.super.show(); 
        Second.super.show(); 
    } 
    public static void main(String args[]) 
    { 
        Diamond ob = new Diamond(); 
        ob.show(); 
    } 
}
