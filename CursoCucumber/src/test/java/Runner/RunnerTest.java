package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format = { "pretty", "html:target/cucumber",
		"json:target/cucumber.json" }, tags = "@Login_jenkins ", features = "src/test/resources/features/JenkinsLogin.feature", glue = {
				"" }, monochrome = false, dryRun = false)
 
public class RunnerTest {
	
 
}   