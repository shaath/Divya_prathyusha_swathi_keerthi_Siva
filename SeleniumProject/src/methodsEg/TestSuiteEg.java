package methodsEg;

import java.io.IOException;

public class TestSuiteEg {

	public static void main(String[] args) throws IOException 
	{
		//Login TC

		OrgMaster om=new OrgMaster();
		
		String res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println("Application Login "+res);
		
		res=om.org_Logout();
		System.out.println("Application Logout "+res);
		
		om.org_Close();
		System.out.println("Application clossed successfully");
		System.out.println("************************************");
		//Empreg
		
		res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println("Application Login "+res);
		
		res=om.org_Empreg("Venki", "Ch");
		System.out.println("Employee Registration "+res);
		
		res=om.org_Logout();
		System.out.println("Application Logout "+res);
		
		om.org_Close();
		System.out.println("Application clossed successfully");
		System.out.println("************************************");
		//User reg
		
		res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println("Application Login "+res);
		
		res=om.org_Userreg("Venki Ch", "VenkiCH123456", "VenkiCH123456", "VenkiCH123456");
		System.out.println("User registration "+res);
		
		res=om.org_Logout();
		System.out.println("Application Logout "+res);
		
		om.org_Close();
		System.out.println("Application clossed successfully");
		System.out.println("************************************");
		//UserLogin
		res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+res);
		
		res=om.org_Login("VenkiCH123456", "VenkiCH123456");
		System.out.println("Application Login "+res);
		
		res=om.org_Logout();
		System.out.println("Application Logout "+res);
		
		om.org_Close();
		System.out.println("Application clossed successfully");

	}

}
