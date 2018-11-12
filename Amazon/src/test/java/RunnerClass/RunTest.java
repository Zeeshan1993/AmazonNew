package RunnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class) 
	@CucumberOptions(
			features= "C:\\Users\\E004194\\git\\repository\\.git",
			glue= {"C:\\Users\\E004194\\git\\repository\\.git"},
	   format = {"pretty", "html:target/Destination"}, dryRun=true,monochrome=true ) 
	
	public class RunTest{}


