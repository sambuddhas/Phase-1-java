package com.project.sambuddha;
		import java.io.*;
		public class FileHandlingAppend {
			public static void main(String[] args){
				 String path = "E:\\\\Sambuddha_\\\\File.Txt";
				 String text = " Thanks for visiting";
				 try
				 {
				 FileWriter f = new FileWriter(path,true);
				 f.write(text);
				 f.close();
				 System.out.println("Append Executed");
				 }
				 catch(IOException e){
				 System.out.println(e);
				 } 
				 }



	}

