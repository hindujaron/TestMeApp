package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Feature/Login.feature",
		glue= {"stepdeff"},
		monochrome=true,
		plugin= {"pretty","html:test-output"}
		)

public class runner {

}
