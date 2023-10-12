package com.sterling;

public class Samplerunner {
   public static void main(String[] args) {
	 Store s=new Temporary(); //Anonymous class
	 s.perform();
	 
	 Store s1=new Store() {

		@Override
		public void perform() {
			// TODO Auto-generated method stub
			System.out.println("Anonymous perform");
		}
		 
	 };
	 
	 s1.perform();
   }
}

class Temporary implements Store {

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Temporary Perform");
	}
	
}

/*
   Reference
   
   Object
   
   Interface can have references
   
   cannot have objects
*/