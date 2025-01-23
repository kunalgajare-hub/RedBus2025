package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features={"src/test/java/Feature"},
		glue= {"StepDefinition"},
		monochrome=true,
		dryRun=false
		
		
		
		)




public class RunnerTest extends AbstractTestNGCucumberTests{

}
