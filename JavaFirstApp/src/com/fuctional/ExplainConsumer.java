package com.fuctional;

import java.util.function.Consumer;

public class ExplainConsumer {
  public static void main(String[] args) {
	  Consumer<Integer> c= (data)->System.out.println(data);
	  Consumer<String> s= (data)->  {
		   System.out.println("Processing "+data);
		   System.out.println("Still processing "+data);
	  };
	  Consumer<String> s1= System.out::println;
	  
	  
	  c.accept(12);
	  s.accept("North Store");
	  s1.accept("Doit");
   }
}
