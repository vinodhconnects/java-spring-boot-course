package com.sterling;

public class Samplerunner2 {
   public static void main(String[] args) {
	  Store s=new Store() {
		 @Override
		public void perform() {
			// TODO Auto-generated method stub
		   System.out.println("Store on the spot");	
		}  
	  };
	  
	  s.perform();
	  
	  Store s1 = () -> {
		  System.out.println("Store on the go");
	  };//automatically it assumes its an anonymous class
	    //for Store, it assumes the definition is for perform
	  s1.perform();
    }
}


/* 

as long as an interface is a functional interface
we can have an alternative syntax for anonymous class
, that syntax is called as lambda expression */