package testrailconnectapiexecution.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"classpath:authController_features"},
		glue="stepdefinations",
		tags="not @Ignore",
		plugin=
			{
				"pretty",
				"html:test-output/cucumberreport.html",
				"json:target/cucumber-reports/CucumberTestReport.json",
				//"rerun:rerun.txt"
			}
		)
public class RunnerTest extends AbstractTestNGCucumberTests {
	/* 
	@Override
	    @DataProvider(parallel = false)
	    public Object[][] scenarios() {
	        return super.scenarios();
	    }
	*/
	
}