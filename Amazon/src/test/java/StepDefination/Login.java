package StepDefination;



import org.openqa.selenium.WebDriver;

import Login.Driver1;
import cucumber.api.java.en.Given;



public class Login extends Driver1

{
	String actual="";
	@Given("^Amazon URL$")
	public static void amazon_URL() throws Throwable {
		WebDriver cr1=driver1();
	
		String actual=cr1.getCurrentUrl();
		System.out.println(actual);
		String expected="https://www.amazon.in/";
		
		if(actual.equals(expected))
		{
		System.out.println("Login sucessfully");	
		}
		else
		{
			System.out.println("Unable to login");
			
		}
		
		
	}
}
