package com.SeleniumProject.Javaprog;

import java.util.Scanner;

public class NestedIfEg2 {

	public static void main(String[] args)
	{
//		String course="Manual";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter course variable value");
		
		String course=sc.next();
		if(course.equals("Manual"))
		{
			System.out.println("You are selected manual");
		}
		else if (course.equalsIgnoreCase("selenium")) 
		{
			System.out.println("You are selected selenium");
		}
		else if (course.equalsIgnoreCase("Uft"))
		{
			System.out.println("You are selected uft");
		}
		else 
		{
			System.out.println("Select a proper course");
		}
	}

}
