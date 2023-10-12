package com.fuctional;

import java.util.function.Predicate;

public class ExplainPredicate {
  public static void main(String[] args) {
	  Predicate<Integer> p = new Predicate<Integer>() {
		  @Override
		public boolean test(Integer t) {
			// TODO Auto-generated method stub
			return t%2==0;
		}
	  };
	  
	  System.out.println(p.test(67));
	  
	  Predicate<Integer> p1=(x)->x%2==0;
	  
	  System.out.println(p1.test(78));
   }
}
