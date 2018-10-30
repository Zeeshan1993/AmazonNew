package StepDefination;



import java.util.concurrent.SynchronousQueue;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Mouse;
//import Login.MouseOver;
import Login.Driver1;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateAccount extends Driver1


{
	@When("^Click on Sign Up link$")
	public void click_on_Sign_Up_link() {
		Driver1 cr1= new Driver1();
		cr1.cr.findElementById("nav-link-yourAccount").click();
	    System.out.println("New user page is opened");
	    cr1.cr.findElementByLinkText("Create your Amazon account").click();
	    
	
	}

	public void enter_Mobile_Number()  {
	    WebElement phoneNumber=(WebElement) cr.findElementsByXPath("//input[@class='_2zrpKA']");
	    phoneNumber.sendKeys("9663636196");
	    System.out.println("Phone number is entered");
	}

}
