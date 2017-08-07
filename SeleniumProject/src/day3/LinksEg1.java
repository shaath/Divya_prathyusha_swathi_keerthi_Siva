package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEg1 {

	public static void main(String[] args) 
	{
		int cnt=0;
		WebDriver driver=new FirefoxDriver();
		driver.get("http://bing.com");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));

		System.out.println(links.size());
		
		for (int i = 0; i < links.size(); i++)
		{
			String lText=links.get(i).getText();
			
			if (!lText.equals(""))
			{
				System.out.println(lText);
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
