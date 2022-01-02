package Runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"classpath:features"},
glue= {"Steps"},
tags="@login",
monochrome = false, 
dryRun = false, 
plugin={"pretty","html:target/cucumber","json:target/cucumber.json"}
		)
public class RunnerMain extends AbstractTestNGCucumberTests {
	 @Override
	    @DataProvider(parallel = true)
	    public Object[][]scenarios() {
	        return super.scenarios();
	 }
}
