package com.pack1;
public class Selection 
{
    public static void main(String[] args) 
    {
    int[] arr = {8,94,71,19,49,22,56};
    int length = arr.length;
    selectionSort(arr);
    System.out.println("The sorting numbers are:");
    for(int i:arr){
        System.out.println(i);
         }
     }
    public static void selectionSort(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int index =i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[index])
                {
                    index =j;
                }
            }
            int smallNumber = arr[index];
            arr[index]= arr[i];
            arr[i]= smallNumber;
        }

    }
}