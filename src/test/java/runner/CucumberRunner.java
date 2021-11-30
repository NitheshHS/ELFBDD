package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {".\\src\\test\\java\\features"},
		glue = {"stepdefinitions","hook"},
		dryRun = false,
		monochrome = true,
		plugin = {"pretty",
				"html:reports\\cucumberreports.html",
				"json:reports\\cucumberjson.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		tags="@SmokeTest and @RegressionTest"
		)
public class CucumberRunner extends AbstractTestNGCucumberTests{
/*
 * Extent report documentation: https://www.toolsqa.com/extent-report/extent-report-for-cucumber-testng-project/
 */
}
