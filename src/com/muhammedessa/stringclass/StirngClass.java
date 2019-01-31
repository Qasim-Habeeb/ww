package com.muhammedessa.stringclass;


public class StirngClass {

	public static void main(String[] args) {
		

		String s1 = "Muhammed Essa";
		
		String s3 = new String("MUHAMMED Essa");
		
		System.out.println(s3);
		
		System.out.println("-----------------------");
        if(s1.equalsIgnoreCase(s3)){
        	System.out.println("They Match !");
        }else{
        	System.out.println("No Match !!");
        }
        char[] ch = s1.toCharArray();
        for (char c : ch) {
        	System.out.println(c);
		}
        
        //to string
        System.out.println("-----------------------");
        char[] charrs = {'m','u','h','a','m','m','e','d'};
        String myStr = new String(charrs);
        System.out.println(myStr);
        
        
        
        // to char
        System.out.println("-----------------------");
        char[] chars = myStr.toCharArray();
         for(char c : chars) {
        	 System.out.println(c);
         }
        
	}

}
