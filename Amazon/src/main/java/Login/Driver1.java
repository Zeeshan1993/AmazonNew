package Login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver1 {
	
	public  static ChromeDriver cr;
	
	public  static WebDriver driver1()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	cr = new ChromeDriver();
	 cr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 cr.get("https://www.amazon.in/");
	 return cr;
	
	}
}
