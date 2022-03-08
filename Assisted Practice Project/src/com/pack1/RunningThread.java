package com.pack1;
public class RunningThread implements Runnable{
	 
    public static int myCount = 0;
    public RunningThread (){
         
    }
    public void run() {
        while(RunningThread .myCount <= 5){
            try{
                System.out.println("Expl Thread: "+(++RunningThread .myCount));
                Thread.sleep(2000);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    } 
    public static void main(String a[]){
        System.out.println("Main Thread.Started..");
        RunningThread  rt = new RunningThread ();
        Thread t = new Thread(rt);
        t.start();
        while(RunningThread .myCount <= 5){
            try{
                System.out.println("Main Thread: "+(++RunningThread .myCount));
                Thread.sleep(1000);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("Main Thread..Closed...");
    }
}
