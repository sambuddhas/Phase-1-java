package com.pack1;
import java.util.*;
import java.util.Map.Entry;
public class Maps {

	public static void main(String[] args) {
		// map
		
		//Hashmap
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(16,"Gaurav");    
	      hm.put(17,"Saurav");    
	      hm.put(18,"Sunny");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Entry<Integer, String> m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	     //HashTable
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(41,"Tanmay");  
	      ht.put(42,"Sowrajit");  
	      ht.put(43,"Satya");  
	      ht.put(44,"Sambuddha");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Entry<Integer, String> n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	      //TreeMap
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(88,"Pune");    
	      map.put(89,"Bengalore");    
	      map.put(90,"Tripura");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Entry<Integer, String> l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  
}
