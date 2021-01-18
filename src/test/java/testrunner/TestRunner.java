package testrunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = {"features/GoogleSearchPage.feature"},
        glue = {"stepdefinitions"},
        plugin = {"json:target/cucumber.json"}
)

public class TestRunner {
    
}
