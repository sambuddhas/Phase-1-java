package com.project.sambuddha;

	import java.io.*;
	public class FileHandlingRead {
			 public static void main(String[] args){
			 try
			 {
			 FileReader r = new FileReader("E:\\\\Sambuddha_\\\\File.Txt");
			 try
			 {
			 int i;
			while((i=r.read())!=-1)
			 {
			 System.out.print((char)i);
			 }
			 }
			 finally
			 {
			 r.close();
			 System.out.print("\n");
			 System.out.print("The file is Successfully Closed");
			 }
			 }
			 catch(IOException e)
			 {
			 System.out.println("Exception Handled");
			 }
			 }
			}
