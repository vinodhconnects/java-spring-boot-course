package com.sterling;

public class JunctionApp {
   public static void process(Junction j,String a,String b) {
	   System.out.println("Process started");
	   String x=j.process(a,b);
	   System.out.println("Result: "+x);
	   System.out.println("Process finished");
   }
}
