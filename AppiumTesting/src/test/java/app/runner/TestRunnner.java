package app.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
			features = {"src/test/resources/Features"},
			glue = {"app.definition"},
			dryRun = false
		)
public class TestRunnner {

}
