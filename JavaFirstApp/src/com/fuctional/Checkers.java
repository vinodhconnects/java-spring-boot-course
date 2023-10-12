package com.fuctional;

public class Checkers {
   public static Boolean isStartWithVowel(String x) {
	   char c=x.toLowerCase().charAt(0);
	   if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
		   return true;
	   return false;
   }
   
   public static Boolean isBigString(String x) {
	   return x.length()>10? true: false;
   }
   
   public static Boolean isUpperCaseStarter(String x)
   {
	   char c=x.charAt(0);
	   if(c>=65 && c<=90)
		   return true;
	   return false;
   }
}
