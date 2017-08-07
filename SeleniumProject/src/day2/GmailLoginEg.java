package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class GmailLoginEg {

	public static void main(String[] args) 
	{
		//Launching the browser
//		FirefoxDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.ie.driver", "F:\\Cdownloads\\IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		//Launching gmail
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		//Maximize the window
//		driver.manage().window().maximize();
		//Identifying email text box
		WebElement email=driver.findElement(By.id("identifierId"));
		//Sending text into email text box
		email.sendKeys("testingtoolstrainer449");
		
//		email.click();
		//Clear the text in email text box
//		email.clear();
		//Clicking next button
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		
		Sleeper.sleepTightInSeconds(5);
		
		//Entering the password into password Text Box
		driver.findElement(By.name("password")).sendKeys("123456789");
		//clicking on next button
		driver.findElement(By.cssSelector(".RveJvd.snByac")).click();
		
		
	}

}
