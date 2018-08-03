package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},tags = "@Login_Sucesso", features = "src/test/resources/features/Curso/Login.feature", glue = {
		"" }, monochrome = true, dryRun = false)


public class Runner2 {
 
}





