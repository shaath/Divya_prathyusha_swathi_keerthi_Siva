package com.SeleniumProject.Javaprog;

public class WhileLoopEg {

	public static void main(String[] args) 
	{
		int i=1;
		while(i<=500)
		{
			System.out.println(i);
			if (i==300)
			{
				break;
			}
			i++;
		}

	}

}
