package day10;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class AlertsEg {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		
		driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		
		driver.findElement(By.xpath(".//*[@id='DG_bankdetails']/tbody/tr[2]/td[8]/a/img")).click();
		
		
		Sleeper.sleepTightInSeconds(3);
		
		Alert alt=driver.switchTo().alert();
		
		System.out.println(alt.getText());
//		
//		alt.accept();
//		
		alt.dismiss();
		
//		alt.sendKeys("YES");
	}

}
