package StepDefination;

import static org.testng.Assert.assertEquals;

import org.apache.commons.logging.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Login.Driver1;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class ShopByCategory extends Driver1
{
	Driver1 dr = new Driver1();
	Actions action = new Actions(dr.cr);
	@When("^mouse hover on the Shop By Category menu and to  Men's Fashion menu$")
	public void mouse_hover_on_the_Shop_By_Category_menu() throws Throwable {
		Thread.sleep(5000);
	    WebElement ShopByCategory=dr.cr.findElementById("nav-link-shopall");
	    
	  action.moveToElement(ShopByCategory).build().perform();
	  WebElement MensFashion = dr.cr.findElementByXPath("//div[@id=\"nav-flyout-shopAll\"]/div[2]/span[8]/span");
	  action.moveToElement(MensFashion).build().perform();
		Thread.sleep(5000);
	}

	
	
	@Then("^Select Casual shoes$")
	public void select_Casual_shoes() throws Throwable {
		
		dr.cr.findElementByXPath("//div[@id=\"nav-flyout-shopAll\"]/div[3]/div[8]/div[2]/div[1]/a[4]").click();
	
	}


}
