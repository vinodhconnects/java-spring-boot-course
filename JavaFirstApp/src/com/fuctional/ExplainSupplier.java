package com.fuctional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class ExplainSupplier {
    public static void main(String[] args) {
		Supplier<String> supply=()-> "India";
		
		System.out.println(supply.get());
		
		//List<String> list=Arrays.asList("Gun","Pen","Random","Storage","Instrument","Neutral");
	
	}
}

