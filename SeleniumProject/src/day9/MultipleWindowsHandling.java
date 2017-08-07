package day9;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class MultipleWindowsHandling {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
//		String gmail=driver.getWindowHandle();
//		System.out.println(gmail);
		
		driver.findElement(By.linkText("Privacy")).click();
		
		Set<String> s=driver.getWindowHandles();
		Iterator<String> it=s.iterator();
		
		while(it.hasNext())
		{
			String wId=it.next();
			System.out.println(wId);
			
			driver.switchTo().window(wId);
			
			try 
			{
				driver.findElement(By.linkText("Terms of Service")).click();
				Sleeper.sleepTightInSeconds(3);
				System.out.println(driver.getTitle()+"-----"+driver.getCurrentUrl());
				break;
			} 
			catch (Exception e)
			{
				System.out.println("The expected link not avaialble in this page");
			}
			
			
		}
		
		driver.quit();
//		driver.findElement(By.linkText("Terms of Service")).click();

	}

}
