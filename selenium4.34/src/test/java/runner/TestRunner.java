package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
		features = {"src/test/resources/features/TestCucumber.feature"},
		snippets = SnippetType.CAMELCASE,
		dryRun = false,
		glue = {"stepDefinitions"})
public class TestRunner extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider()
	public Object[][] scenarios()
	{
		return super.scenarios();
		
	}
}
