package day6;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class AutofillersEg {

	public static void main(String[] args)
	{
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("html/body/section/div[2]/main/section/div/div[2]/section/div/div[1]/div/input")).sendKeys("E");
		Sleeper.sleepTightInSeconds(5);
		
		List<WebElement> list=driver.findElements(By.xpath(".//*[@id='search']/div/div[1]/div/ul/li"));
		
		System.out.println(list.size());
		
		Actions act=new Actions(driver);
		
		for (int i = 0; i < list.size(); i++)
		{
			String city=list.get(i).getText();
			System.out.println(city);
			act.sendKeys(Keys.ARROW_DOWN).build().perform();
			if (city.equalsIgnoreCase("Erraguntla"))
			{
				act.sendKeys(Keys.ENTER).build().perform();
				break;
			}
		}
	}

}
