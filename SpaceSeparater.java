package com.day4;

public class SpaceSeparater { 
	public static void main (String [] args) {
		String [] a=args[0].split(",");
	
		int result1=Integer.parseInt (a[0]);
		int result2=Integer.parseInt(a [1]);
		int result3=result1+result2;
		System.out.println(result3);
	
				
	}

}
