package methodsEg;

import java.io.IOException;

public class ReuseEg {

	public static void main(String[] args) throws IOException 
	{
//		MethodsEg.function1();
		
		MethodsEg m=new MethodsEg();
//		m.function3();
//		
//		int res=m.sum(200,300);
//		System.out.println(res);
		
		m.Br_Launch("firefox", "http://primusbank.qedgetech.com");
//		m.takes_screenshot("orgHRM");
		m.send_Text("id", "txtuId", "Admin");

		m.send_Text("id", "txtPword", "Admin");
		m.click("id", "login");
	}

}
