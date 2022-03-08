package com.pack1;
class MyException extends Exception 
{ 
    public MyException(String s) 
    { 
        super(s); 
    } 
} 
public class Custom
{ 
    public static void main(String args[]) 
    { 
        try
        { 
            throw new MyException("Hai"); 
        } 
        catch (MyException ex) 
        { 
            System.out.println("Bye"); 
            System.out.println(ex.getMessage()); 
        } 
    } 
}