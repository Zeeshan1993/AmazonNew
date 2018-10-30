package StepDefination;

import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;

import Login.Driver1;
import cucumber.api.java.en.Then;

public class CreateOrder extends Driver1
{
	Driver1 dr=new Driver1();
	JavascriptExecutor js= (JavascriptExecutor)dr.cr;
	@Then("^Select the size$")
	public void select_the_size() throws Throwable {
		js.executeScript("window.scrollBy(0,100)");
	//dr.cr.findElementByXPath("//div[@id=\"leftNav\"]/ul[5]/li[11]/span/a/div/span").click();
	dr.cr.findElementByClassName("a-link-normal").click();
	Thread.sleep(5000);
	}

	@Then("^choose the Price$")
	public void choose_the_Price() throws Throwable {
		js.executeScript("window.scrollBy(0,200)");
	   dr.cr.findElementByXPath("//div[@id=\"leftNavContainer\"]/ul[6]/div/li[1]/span/a/span").click();
	   Thread.sleep(5000);
	}

	@Then("^choose the brand$")
	public void choose_the_brand() throws Throwable {
		js.executeScript("window.scrollBy(0,200)");
	   dr.cr.findElementByXPath("//div[@id=\"leftNavContainer\"]/ul[7]/div/li[7]/span/span/div/label/span/span").click();
	   Thread.sleep(5000);
	}
	
	@Then("^select the Red colour$")
	public void select_the_Red_colour() throws Throwable {
		js.executeScript("window.scrollBy(0,200)");
	    dr.cr.findElementByXPath("//div[@id=\"leftNavContainer\"]/ul[8]/li[6]/span/a/div").click();
	    Thread.sleep(5000);
	}

	@Then("^Click on the First product$")
	public void click_on_the_First_product() throws Throwable {
		dr.cr.findElementByXPath("//li[@id=\"result_0\"]/div/div[2]/div/a/img").click();
	}
	
	@Then("^Click on Add to cart$")
	public void click_on_Add_to_cart() throws Throwable {
		Actions action= new Actions(dr.cr);
		action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();
		System.out.println("new tab is opened");
		Thread.sleep(6000);
		action.moveToElement(dr.cr.findElementById("add-to-cart-button")).click().build().perform();
		System.out.println("new tab is moved");
		dr.cr.findElementById("add-to-cart-button").click();
		System.out.println("add-to-cart-butto clicked");
		TakesScreenshot scrshot=((TakesScreenshot)dr.cr);
		File srcFile=scrshot.getScreenshotAs(OutputType.FILE);
		 File DestFile=new File("Libraries\\Documents");
	
		 
	}

	
}
