package StepDefination;

import org.apache.commons.logging.Log;
import org.openqa.selenium.WebElement;

import Login.Driver1;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SetLocation extends Driver1

{
	String pincode="";
	WebElement pincodeText;
	  Driver1 dr=new Driver1();
	@Then("^Click on Deliver To$")
	public void click_on_Deliver_To() throws Throwable {
	  
	    dr.cr.findElementById("nav-packard-glow-loc-icon").click();
	    System.out.println("Deliver To is clicked");
	}
	
	@Then("^Click on Change Link$")
	public void click_on_Change_Link() throws Throwable {
		dr.cr.findElementByLinkText("Change").click();
		System.out.println("Change is clicked");
	    
	}

	@Then("^check if existed pincode is same as the current location pincode$")
	public void check_if_existed_pincode_is_same_as_the_current_location_pincode() throws Throwable {
	pincodeText = dr.cr.findElementById("GLUXZipUpdateInput");
		//pincodeText = dr.cr.findElementByXPath("//div[@class=\"a-column a-span8\"]/input");
	pincode=pincodeText.getAttribute("value");
	   System.out.println("pincode is:"+ pincode );
	   
	}

	@When("^existed pincode is not same as the current location pincode$")
	public void existed_pincode_is_notsame_as_the_current_location_pincode() throws Throwable {
		if(pincode == "500081")
		   {
	   System.out.println("enter pincode is correct");
	 }
		else 
		{
	   System.out.println("enter pincode is not correct");
		}
	}

	@Then("^Enter Pincode as \"([^\"]*)\"$")
	public void enter_Pincode_as(String arg1) throws Throwable 
	{
		//dr.cr.findElementByXPath("//div[@class=\"a-column a-span8\"]/input").clear();
		pincodeText.clear();
		pincodeText.sendKeys(arg1);
		System.out.println("Pincode is entered "+ arg1);
		
	  
	}
	
	@Then("^click on Apply button$")
	public void click_on_Apply_button() throws Throwable 
	{
	  dr.cr.findElementByXPath("//div[@class=\"a-column a-span4 a-span-last\"]/span/ span/input").click();
	  Thread.sleep(5000);
	  System.out.println("Apply button is clicked");
	}
	@Then("^Click on Done$")
	public void click_on_Done() throws Throwable {
	   //dr.cr.findElementByXPath("//div[@class=\"a-popover-footer\"]/span/span/span/button").click();
	   dr.cr.findElementById("a-autoid-3-announce").click();
	   System.out.println("Location set is sucessfull");
	}
	
}
