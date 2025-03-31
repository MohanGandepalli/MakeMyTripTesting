/* Author: Mohan Krishna Gandepalli
 * Email: mohankrishnagandepalli@gmail.com
 * UserID: 24NAG1904_U26
 * Description: To run feature files by gluing steps and application hooks using testng parallely 
 */
package Steps;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/"
				}, 
		monochrome = true,
		glue = { "Steps" },
		features = { "src/test/resources/features/MakeMyTripFeature.feature" }
)

public class ParallelRunBDD extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
}