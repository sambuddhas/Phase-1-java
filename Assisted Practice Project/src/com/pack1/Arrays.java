package com.pack1;
public class Arrays {

public static void main(String[] args) {

//single-dimensional array
int a[]= {20,30,40,50,60};
for(int i=0;i<5;i++) {
System.out.println("Elements of array a: "+a[i]);
}


//multidimensional array
int[][] b = {
            {4, 6, 8, 10}, 
            {3, 2, 6} };
      
      System.out.println("\nLength of row 1: " + b[0].length);
      }
}