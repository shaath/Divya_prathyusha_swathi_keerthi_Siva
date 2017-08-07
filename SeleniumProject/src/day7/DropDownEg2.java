package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEg2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.khuranatravel.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[5]/div/a")).click();
		WebElement f=driver.findElement(By.id("fromCity"));
		
		Select fDrop=new Select(f);
		List<WebElement> fList=fDrop.getOptions();
		
		WebElement t=driver.findElement(By.id("toCity"));
		Select tDrop=new Select(t);
		
		for (int i = 0; i < fList.size(); i++) 
		{
			fDrop.selectByIndex(i);
			String fCity=fList.get(i).getText();
			System.out.println(fCity);
			
			List<WebElement> tList=tDrop.getOptions();
			for (int j = 0; j < tList.size(); j++) 
			{
				tDrop.selectByIndex(j);
				String tCity=tList.get(j).getText();
				
				if (fCity.equalsIgnoreCase(tCity))
				{
					System.out.println("Fail");
				}
				else 
				{
					System.out.println("Pass");
				}
			}
		}

	}

}
