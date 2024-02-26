package ivet.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
        glue = {"ivet.steps"},
        plugin = {"pretty", "html:target/site/cucumber-pretty", "json:target/cucumber/cucumber.json"},
        tags = "@Smoke")

public class RunCucumberTests {
}
