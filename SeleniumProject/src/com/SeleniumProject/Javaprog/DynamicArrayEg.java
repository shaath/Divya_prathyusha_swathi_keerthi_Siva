package com.SeleniumProject.Javaprog;

public class DynamicArrayEg {

	public static void main(String[] args) 
	{
		Object[] x=new Object[5];
		
		//Finding the lenght of the array
		System.out.println(x.length);
		
		//Writing the data into an array
		x[1]="Selenium";
		x[3]=50000;
		x[1]=true;
		
		//Reading the data from array
		for (int i = 0; i < x.length; i++) 
		{
			System.out.println(x[i]);
		}
		
	}

}
