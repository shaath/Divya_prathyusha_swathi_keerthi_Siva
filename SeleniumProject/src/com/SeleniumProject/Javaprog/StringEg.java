package com.SeleniumProject.Javaprog;

public class StringEg {

	public static void main(String[] args) 
	{
		String x="Selenium";
		
		System.out.println(x.length());

		System.out.println(x.charAt(5));
		
		System.out.println(x.substring(2, 6));
		
		System.out.println(x.replace("e", "a"));
		
		System.out.println(x.toUpperCase());
		
		System.out.println(x.toLowerCase());
		
		System.out.println("You are selected "+x);
	}

}
