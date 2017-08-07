package com.SeleniumProject.Javaprog;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args)
	{
		ArrayList<Object>  s=new ArrayList<Object>();
		
		//Write the data into arraylist
		
		s.add("Selenium");
		s.add(4000);
		s.add(true);
		s.add('M');
		s.add("Selenium");
		s.add(5, "UFT");
		s.add(2, "Apple");
		
		//Finding the size of the array
		System.out.println(s.size());
		
		//Reading the data from arraylist
//		System.out.println(s.get(2));
		for (int i = 0; i < s.size(); i++) 
		{
			System.out.println(s.get(i));
		}

	}

}
