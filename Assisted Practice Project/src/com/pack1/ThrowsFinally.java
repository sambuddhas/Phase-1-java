package com.pack1;
public class ThrowsFinally
{
    public static void main(String[] args)
    {

        int a=65,b=0,rs;

        try
        {
            if(b==0)        
                throw(new ArithmeticException("Can not divide by zero."));
            else
            {
                rs = a / b;
                System.out.print("\n\tThe result is : " + rs);
            }
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\n\tError : " + Ex.getMessage());
        }

        System.out.print("\n\tTerminated.");
    }
}