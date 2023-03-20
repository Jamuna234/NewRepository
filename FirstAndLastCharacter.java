package com.day4;

public class FirstAndLastCharacter {
	public static void main (String [] args) {
	
		String[] a = args[0].split(",");
		System.out.println( a[0].toLowerCase());
		System.out.println(a[1].toUpperCase());
		System.out.println(a[3].length());
		System.out.println(a[4].concat(" priya"));
		System.out.println(a[5].startsWith("a"));
		System.out.println(a[6].endsWith("j"));
		System.out.println(a[7].equals("jammu"));
		System.out.println(a[8].equalsIgnoreCase("vyyy"));
		System.out.println(a[9].charAt(1));
	 System.out.println(a[10].indexOf("j"));
	 System.out.println(a[11].substring(0,4));
	 System.out.println(a[12].toCharArray());
	 
	 

	 
	}
}