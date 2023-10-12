package com.fuctional;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ListFilter {
  public static void main(String[] args) {
	  
	  
	  List<Integer> lista= Arrays.asList(345,35,6467,567,56,23,365,45,34,359,124,56,256,188,17194);
	  
	  List<Integer> listb=lista.stream().filter(x->x%2==0).toList();
	  
	  List<Integer> listc=lista.stream().filter(x->x%3==0 && x%7==0).toList();
	  
	  //lista.forEach(x-> System.out.println(x));
	  lista.forEach(System.out::println);
	  
	 /* for(Integer x:listb) {
		  System.out.print(x+" ");
	  }
	  System.out.println();
	  for(Integer x:listc) {
		  System.out.print(x+" ");
	  }*/
   }
}
