package com.fuctional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ExplainFunction {
   public static void main(String[] args) {
	  Function<String,String> fun=(x)-> "Hello!"+x;
	  
	  List<String> list=Arrays.asList("Gun","Pen","Random","Storage","Instrument","Neutral");
		
	  List<String> result=list.stream().map(fun).toList();
	  List<String> result2=list.stream().map(x-> x+" -> length: "+x.length()).toList();
	  result.stream().forEach(System.out::println);
	  result2.stream().forEach(x->System.out.print(x+"   "));
    }
}
