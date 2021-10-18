package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src/test/java/feature"
		,glue= {"stepDefinition","hooks"},
		//dryRun = true,
		//monochrome=true,
		//tags = {"@ReturnID"or "@OrderID" or "@CustomerName", "@ProductName",  "@ModelName", "@ReturnStatus", "@TabelView", @Pagination, "@Checkbox",  "@DateAdded" , "@DateModified" }
		//tags= {"@EditReturnProduct"},
		tags= {"~@Ignore"},
		plugin= {"pretty"/*, "html:target/Retail-Website-HTML-report"*/}
		)

public class TestRunner {

}
