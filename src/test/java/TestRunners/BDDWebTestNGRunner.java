package TestRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
features = {"src/test/resources/features/MakeMyTripFeature.feature"},
glue = {"Steps", "ApplicationHooks"},
tags= "@Holiday",
plugin = {"pretty",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"timeline:test-output-thread/"

		
})

public class BDDWebTestNGRunner extends AbstractTestNGCucumberTests{

}
