/* Author: Mohan Krishna Gandepalli
 * Email: mohankrishnagandepalli@gmail.com
 * UserID: 24NAG1904_U26
 * Description: To run feature files by gluing steps and application hooks using junit 
 */
package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/features/MakeMyTripFeature.feature"},
		glue = {"Steps"},
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/"

				
		}
		
		)

public class BDDWebJUnitRunner {

}
