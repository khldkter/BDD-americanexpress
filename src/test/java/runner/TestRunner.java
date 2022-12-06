package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/java/features/",
 		tags= "@auto2",
 		glue = {"base","steps"},
 		monochrome = true,
 		dryRun = false,
        plugin = "html:target/index.html")

public class TestRunner {

}
