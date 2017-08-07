package methodsEg;

import java.io.IOException;

public class UserRegTc {

	public static void main(String[] args) throws IOException 
	{
		OrgMaster om=new OrgMaster();
		
		String res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println("Application Login "+res);
		
		res=om.org_Userreg("Sharath Chandra", "SharathChandra123456", "SharathChandra123456", "SharathChandra123456");
		System.out.println("User registration "+res);
		
		res=om.org_Logout();
		System.out.println("Application Logout "+res);
		
		om.org_Close();
		System.out.println("Application clossed successfully");

	}

}
