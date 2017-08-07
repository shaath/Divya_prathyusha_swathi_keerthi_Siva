package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebtableEg2 {

	public static void main(String[] args)
	{

		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();

		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Employee List")).click();
		
		List<WebElement> rows=driver.findElements(By.xpath(".//*[@id='resultTable']/tbody/tr"));
		System.out.println(rows.size());
		
		for (int i = 0; i < rows.size(); i++)
		{

			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
//			System.out.println(cols.size());
			String eId=cols.get(1).getText();
			System.out.println(eId);
			if (eId.equalsIgnoreCase("0016"))
			{
				cols.get(0).click();
				driver.findElement(By.id("btnDelete")).click();
				driver.findElement(By.id("dialogDeleteBtn")).click();
				break;
			}
		}

	}

}
