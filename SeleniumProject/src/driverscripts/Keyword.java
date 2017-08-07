package driverscripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import methodsEg.OrgMaster;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Keyword {

	public static void main(String[] args) throws IOException 
	{
		OrgMaster om=new OrgMaster();
		String res=null;
		String xlpath="F:\\Evening 9PM New Batch\\SeleniumProject\\src\\com\\SeleniumProject\\TestData\\Keyword.xlsx";
		
		String xlout="F:\\Evening 9PM New Batch\\SeleniumProject\\src\\com\\SeleniumProject\\Results\\keyres.xlsx";
		FileInputStream fi=new FileInputStream(xlpath);
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet tc_Sht=wb.getSheet("Testcase");
		XSSFSheet ts_Sht=wb.getSheet("Teststeps");
		XSSFSheet td_Sht=wb.getSheet("TestData");
		
		int tc_Rc=tc_Sht.getLastRowNum();
		int ts_Rc=ts_Sht.getLastRowNum();
		
		for (int i = 1; i <= tc_Rc; i++) 
		{
			tc_Sht.getRow(i).createCell(3);
			String exe=tc_Sht.getRow(i).getCell(2).getStringCellValue();
			if (exe.equalsIgnoreCase("Y"))
			{
				String tcId=tc_Sht.getRow(i).getCell(0).getStringCellValue();
				
				for (int j = 1; j <= ts_Rc; j++) 
				{
					String tstcId=ts_Sht.getRow(j).getCell(0).getStringCellValue();
					
					if (tcId.equalsIgnoreCase(tstcId))
					{
						String key=ts_Sht.getRow(j).getCell(3).getStringCellValue();
						System.out.println(key);
						
						switch (key) 
						{
						case "Launch":
							String url=td_Sht.getRow(1).getCell(0).getStringCellValue();							
							res=om.org_Launch(url);
							break;
						case "login":
							String u=td_Sht.getRow(1).getCell(1).getStringCellValue();
							String p=td_Sht.getRow(1).getCell(2).getStringCellValue();
							res=om.org_Login(u, p);
							break;
						case "logout":
							res=om.org_Logout();
							break;
						case "Empreg":	
							String f=td_Sht.getRow(1).getCell(3).getStringCellValue();
							String l=td_Sht.getRow(1).getCell(4).getStringCellValue();
							res=om.org_Empreg(f, l);
							break;
						case "Usereg":
							String ename=td_Sht.getRow(1).getCell(5).getStringCellValue();
							String uname=td_Sht.getRow(1).getCell(6).getStringCellValue();
							String pswd=td_Sht.getRow(1).getCell(7).getStringCellValue();
							String cpswd=td_Sht.getRow(1).getCell(8).getStringCellValue();
							res=om.org_Userreg(ename, uname, pswd, cpswd);
							break;
						case "Ulogin":	
							String un=td_Sht.getRow(1).getCell(6).getStringCellValue();
							String cp=td_Sht.getRow(1).getCell(7).getStringCellValue();
							res=om.org_Login(un, cp);
							break;
						default:
							break;
						}
						//Update the result in test steps sheet
						ts_Sht.getRow(j).createCell(4).setCellValue(res);
						//Updating the result in test case sheet
						if (!tc_Sht.getRow(i).getCell(3).getStringCellValue().equalsIgnoreCase("Fail"))
						{
							tc_Sht.getRow(i).getCell(3).setCellValue(res);
						}
						
					}
				}
				
			}
			else
			{
				tc_Sht.getRow(i).createCell(3).setCellValue("BLOCKED");
			}
		}
		
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();
		
	}

}
