package com.fuctional;

import java.util.Arrays;
import java.util.List;

public class StringListFilter {
  public static void main(String[] args) {
	  List<String> original = 
	  Arrays.asList("Narrow","Sparrow","Jack","Anderson","Motivation","Evolution","Break","International"
			   ,"Aggresssion","Assertion","Store","stock","steel","permutation","lecture","india");
	  
	  List<String> result1=original.stream().filter(Checkers::isBigString).toList();
	  List<String> result2=original.stream().filter(Checkers::isStartWithVowel).toList();
	  List<String> result3=original.stream().filter(Checkers::isUpperCaseStarter).toList();
	  List<String> result4=original.stream().filter(x->x.startsWith("A")).toList();
	  for(String x:result1)
		  System.out.print(x+" ");
	  System.out.println();
	  for(String x:result2)
		  System.out.print(x+" ");
	  System.out.println();
	  for(String x:result4)
		  System.out.print(x+" ");
	  System.out.println();
	   
	   
   }
}
