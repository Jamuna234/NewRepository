package com.day4;

public class UsePen {


	public static void main (String[] args) {
		Pen pen=new Pen();
		
		String[] a=args[0].split(":");
		pen.brand=a[0];
		pen.price=Integer.parseInt(a[1]);
		pen.colour=a[2];
		
		
		System.out.println("brand="+pen.brand+","+"price="+pen.price+","+"colour="+pen.colour);
		
		Pen pen1=new Pen();
		String [] b=args[0].split(":");
		
		
		
		
		
		
		

		
		
	}
	
	
	

}

class Pen {

	String brand;
	int price;
	String colour;
	
}
