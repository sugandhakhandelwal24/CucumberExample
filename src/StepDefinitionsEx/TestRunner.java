package StepDefinitionsEx;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(    
		
		monochrome = true,
		//plugin = {"pretty"}, // see the output in the console in pretty format
		plugin = {"pretty","html:target/cucumber-html"},
		features = "src/features",
	//	tags = {"@NegativeLogin,@PositiveLogin"},
		//tags = {"@NegatuveLogin","@Sanity"},
		tags= {"@LoginFeature"},
		glue = {"StepDefinitionsEx"} // only tags and glue needs to be specified with curly braces
		)
public class TestRunner {

}
