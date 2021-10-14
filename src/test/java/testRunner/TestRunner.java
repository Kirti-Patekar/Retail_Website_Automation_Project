package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src/test/java/feature"
		,glue= {"stepDefinition","hooks"},
		dryRun = true,
		monochrome=true,
		//tags = {"@ReturnID"or "@OrderID" or "@CustomerName", "@ProductName",  "@ModelName", "@ReturnStatus", "@TabelView"},
		//tags= {"@TabelView"},
		tags= {"~@Ignore"},
		plugin= {"pretty", "html:target/cucumber-report"}
		)

public class TestRunner {

}
