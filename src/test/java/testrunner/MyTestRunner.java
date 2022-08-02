package testrunner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/main/resources/AppFeatures"},
		glue = {"stepDefinations", "AppHooks"},
				//plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
				
				plugin = {"pretty",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
						"timeline:test-output-thread/"}
		
		)

public class MyTestRunner extends AbstractTestNGCucumberTests {

}