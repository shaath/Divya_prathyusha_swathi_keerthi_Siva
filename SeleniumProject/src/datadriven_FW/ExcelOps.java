package datadriven_FW;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import methodsEg.OrgMaster;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOps {

	public static void main(String[] args) throws IOException 
	{
		String xlpath="F:\\Evening 9PM New Batch\\SeleniumProject\\src\\com\\SeleniumProject\\TestData\\Testdata.xlsx";
		String xlout="F:\\Evening 9PM New Batch\\SeleniumProject\\src\\com\\SeleniumProject\\Results\\EmpRes.xlsx";
		
		OrgMaster om=new OrgMaster();
		
		FileInputStream fi=new FileInputStream(xlpath);

		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("EmpReg");
//		XSSFRow r=ws.getRow(2);
//		XSSFCell c=r.getCell(0);
//		
//		System.out.println(c.getStringCellValue());
		int rc=ws.getLastRowNum();
		System.out.println(rc);
//		XSSFRow r=ws.getRow(1);
//		int cc=r.getLastCellNum();
//		System.out.println(cc);
		
		om.org_Launch("http://opensource.demo.orangehrmlive.com");
		om.org_Login("Admin", "admin");
		
		for (int i = 1; i <= rc; i++) 
		{
			XSSFRow r=ws.getRow(i);
			XSSFCell c=r.getCell(0);
			XSSFCell c1=r.getCell(1);
			XSSFCell c2=r.createCell(2);
			
			String f=c.getStringCellValue();
			String l=c1.getStringCellValue();
			
			System.out.println(f+"---"+l);
			String res=om.org_Empreg(f, l);
			
			c2.setCellValue(res);
		}
		
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();
		
		om.org_Logout();
		om.org_Close();
	}

}
