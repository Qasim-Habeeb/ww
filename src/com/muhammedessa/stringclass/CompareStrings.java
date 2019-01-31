package com.muhammedessa.stringclass;

public class CompareStrings {

	public static void main(String[] args) {
		   
		String str = "Muhammed";
		String str2 = "Muhammed";
		      
		if(str == str2) {
			 System.out.println( "the two strings are same ")  ;
		}else {
			System.out.println( "No match ")  ;
		}

		
		
		String str3 = "muhammed";
		 
		      
		if(str == str3) {
			 System.out.println( "the two strings are same ")  ;
		}else {
			System.out.println( "No match ")  ;
		}
		
		
		
		String str4 = "Muhammed ";
		String str5 = "Essa";
		
		String str6 = str4 + str5;
		String str7 =  "Muhammed Essa"  ;
		      
		if(str6 == str7) {
			 System.out.println( "the two strings are same ")  ;
		}else {
			System.out.println( "No match ")  ;
		}
		
		

		
		if(str6.equals(str7)) {
			 System.out.println( "the two strings are same ")  ;
		}else {
			System.out.println( "No match ")  ;
		}
		
		

	}

}
