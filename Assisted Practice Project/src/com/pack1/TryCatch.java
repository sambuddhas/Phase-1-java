package com.pack1;
public class TryCatch 
{
    public static void main(String args[]) 
    {
        int[] array = new int[3];
        try 
        {
            array[7] = 16;
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Index Bounce of an Array !"); 
        }
        finally 
        {
            System.out.println("The array is of size " + array.length);
        }
    }
}