 package cucumberOptions;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\Vusal\\Desktop\\1\\SoftWareTesting\\Eclipse\\Cucumber1\\src\\test\\java\\features",
		glue="stepDefinitions"
		)


public class TestRunner {

}
