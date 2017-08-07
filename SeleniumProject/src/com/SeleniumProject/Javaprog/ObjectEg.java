package com.SeleniumProject.Javaprog;

public class ObjectEg {

	public static void main(String[] args)
	{
		Object[] s={"Selenium",'M',40000,444.44,true};
		
		System.out.println(s.length);

		for (Object data : s)
		{
			System.out.println(data);
		}
	}

}
