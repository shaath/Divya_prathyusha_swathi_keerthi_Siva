package testNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmpregTest extends TestNGMaster
{
	@Test(dataProvider="data")
	public void org_Empreg(String fn,String ln)
	{
		expval=fn+" "+ln;
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(fn);
		driver.findElement(By.id("lastName")).sendKeys(ln);
		driver.findElement(By.id("btnSave")).click();
		
		actval=driver.findElement(By.xpath(".//*[@id='profile-pic']/h1")).getText();
		Assert.assertEquals(actval, expval, "Employee Registration Failed");
	}
	
	@DataProvider
	public Object[][] data()
	{
		Object[][] d=new Object[3][2];
		
		d[0][0]="Venki";
		d[0][1]="CH";
		
		d[1][0]="Sandeep";
		d[1][1]="Kumar";
		
		d[2][0]="Vignan";
		d[2][1]="Kumar";
		
		return d;
		
		
	}
}
