package com.SeleniumProject.Javaprog;

import java.util.Scanner;

public class SwitchCaseEg {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter course variable value");
		
		String course=sc.next();
//		String course="Loadrunner";
		
		switch(course)
		{
		case "selenium":
			System.out.println("You are selected Selenium");
			break;
		case "Manual":
			System.out.println("You are selected Manual");
			break;
		case "UFT":
			System.out.println("You are selected UFT");
			break;
		default:
			System.out.println("Select a proper course");
			break;
		}

	}

}
