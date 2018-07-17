package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@Login_Sucesso, @Login_acesso_negado",features = "src/test/resources/features/Login.feature", glue = {
		"" }, monochrome = true, dryRun = false)

 public class Runner { 

	
}
 