package com.sterling;

public class Samplerunner3 {
  public static void main(String[] args) {
	 JunctionApp.process(new Junction() {

		@Override
		public String process(String a, String b) {
			// TODO Auto-generated method stub
			return a+" is coded using"+b;
		}
		 
	 }, "Java", "Eclipse");
	 
	 JunctionApp.process((a,b)-> a +" is developed using"+b, "Mobile APP", "Kotlin");
  }
}
