package com.SeleniumProject.Javaprog;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEg {

	public static void main(String[] args) 
	{
		Set<Object> s=new HashSet<Object>();
		
		//Writing the data into hashset
		s.add("Selenium");
		s.add("UFT");
		s.add(50000);
		s.add(true);
		s.add('M');
		s.add("Apple");
		s.add("Apple");
		
		Iterator<Object> it=s.iterator();
		
		//Reading the data from hashset
		
		while (it.hasNext())
		{
			Object data=it.next();
			System.out.println(data);
		}
		

	}

}
