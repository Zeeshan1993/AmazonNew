package RunnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class) 
	@CucumberOptions(
			features= "C:\\Users\\E004194\\Desktop\\Maven\\Eclipse-Workspace\\Amazon\\src\\test\\java\\Feature",
			glue= {"C:\\Users\\E004194\\Desktop\\Maven\\Eclipse-Workspace\\Amazon\\src\\test\\java\\StepDefination"},
	   format = {"pretty", "html:target/Destination"}, dryRun=true,monochrome=true ) 
	
	public class RunTest{}


