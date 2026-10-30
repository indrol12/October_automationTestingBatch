package Stepdefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="CucumberFeatures",
		tags = "@Smoke",
		glue= {"Stepdefinations","hooks"},
				  plugin = {
					        "pretty",
					        "html:target/cucumber-report.html",
					        "json:target/cucumber.json"
					    }
		)
public class runner {

}
