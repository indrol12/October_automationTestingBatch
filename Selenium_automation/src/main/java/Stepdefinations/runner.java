package Stepdefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="CucumberFeatures/swaglablogin_logout.feature",
		glue= {"Stepdefinations"},
				  plugin = {
					        "pretty",
					        "html:target/cucumber-report.html",
					        "json:target/cucumber.json"
					    }
		)
public class runner {

}
