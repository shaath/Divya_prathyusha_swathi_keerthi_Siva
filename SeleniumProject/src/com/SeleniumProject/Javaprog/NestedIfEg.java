package com.SeleniumProject.Javaprog;

public class NestedIfEg {

	public static void main(String[] args)
	{
		int a=40;
		int b=300;
		int c=2000;
		
		if (a > b & a > c)
		{
			System.out.println("A is Greater");
		}
		else if (b > a & b > c )
		{
			System.out.println("B is Greater");
		}
		else 
		{
			System.out.println("C is Greater");
		}

	}

}
