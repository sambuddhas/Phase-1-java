package com.pack1;
public class SleepWait
{
    private static Object LOCK = new Object();
    public static void main(String args[]) throws InterruptedException
    {
        Thread.sleep(1000);
        System.out.println("Thread sleep '" + Thread.currentThread().getName() + "' is  sleeping for a second");
        synchronized (LOCK) 
        {
            LOCK.wait(1000);
            System.out.println("Object '" + LOCK + "' is  after" + " wait is over");
        }
    }
}
