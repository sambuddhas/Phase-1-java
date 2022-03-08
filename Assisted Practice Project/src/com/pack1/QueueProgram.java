package com.pack1;
import java.util.*;
public class QueueProgram {
   public static void main(String[] args) 
   {  
    Queue<String> str_queue = new LinkedList<>();
    str_queue.add("Aeroplane");
    str_queue.add("Train");
    str_queue.add("Bike");
    str_queue.add("Ship");
    System.out.println("The Queue Data:" + str_queue);
    }
}