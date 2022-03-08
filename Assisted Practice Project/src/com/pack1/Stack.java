package com.pack1;
public class Stack 
{ 
    	static final int MAX = 2000; 
    	int top; 
    	int a[] = new int[MAX];  
  	boolean isEmpty() 
    	{ 
        		return (top < 1); 
    	} 
    	Stack() 
    	{ 
        		top = -1; 
    	} 
  	boolean push(int x) 
    	{ 
        		if (top >= (MAX-1)) 
        		{ 
            			System.out.println(" Overflow of Stack "); 
            			return false; 
        		} 
        		else
        		{ 
            			a[++top] = x; 
            			System.out.println(x + " pushed into stack"); 
            			return true; 
        		} 
    	} 
int pop() 
    	{ 
        		if (top < 1) 
        		{ 
            			System.out.println("Stack Underflow"); 
            			return 0; 
        		} 
        		else
        		{ 
            			int x = a[top--]; 
            			return x; 
        		} 
    	} 
    
    	public static void main(String args[])
{
        		Stack s = new Stack(); 
        		s.push(400); 
        		s.push(44); 
        		s.push(89); 
        		System.out.println(s.pop() + " Popped out from stack"); 
    	}
} 
