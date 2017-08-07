package com.SeleniumProject.Javaprog;

public class ReverseStringEg {

	public static void main(String[] args)
	{
		//QEdge------> egdEQ
		String  O="QEdge";
		
		int len=O.length();
		
		for (int i = 0; i < O.length(); i++) 
		{
			System.out.println(O.charAt(i));
		}
		System.out.println("*****");
		
		for (int i = len-1; i >= 0; i--) 
		{
			System.out.print(O.charAt(i));
		}
	}

}
