package com.pack1;
public class Finally
{
    public static void main(String[] args)
    {
        int a=65,b=1,rs=1;
        try
        {
            rs = a / b;
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\n\tError : " + Ex.getMessage());
        }
        finally
        {
            System.out.print("\n\tThe result is : " + rs);
        }
    }
}