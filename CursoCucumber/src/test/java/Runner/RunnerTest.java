package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format = { "pretty", "html:target/cucumber",
		"json:target/cucumber.json" }, tags = "@Inclusao_de_contas", features = "src/test/resources/features/InserirConta.feature", glue = {
				"" }, monochrome = false, dryRun = false)
 
public class RunnerTest {
 
}
