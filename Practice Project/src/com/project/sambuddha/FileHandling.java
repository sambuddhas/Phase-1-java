package com.project.sambuddha;

	import java.io.*;
	public class FileHandling {
			 public static void main(String[] args){
			 try
			 {
			FileWriter f = new FileWriter("E:\\Sambuddha_\\File.Txt");
			 try
			 {
			 f.write("Hello Everyone My Name is Sambuddha");
			 }
			 finally
			 {
			 f.close();
			 }
			 System.out.println("Task Completed");
			 }
			 catch(IOException i)
			 {
			 System.out.println(i);
			 } 
			 
			 }
			}


