import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class JunitMaster 
{
	public static WebDriver driver;
	
	@BeforeClass
	public static void primus_Launch()
	{
		driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com");
		driver.manage().window().maximize();
	}
	@AfterClass
	public static void primus_Close()
	{
		driver.close();
	}

}
