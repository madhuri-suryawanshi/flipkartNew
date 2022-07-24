package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
		(
		plugin="pretty",										//to get console answer in clear 
		features="src/test/resources/BusinessLogic",			//location of feature file
		tags="@SmokeTest",										//Which test cases need to execute by tag
		glue="cucumbermap",
		monochrome=true											//console result is clear
				
		)


public class runTest 
{

}
