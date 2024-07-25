package runners;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/features", // Path to the feature files
    glue = "stepDefinitions" // Path to the step definitions

)
public class TestRunner {
}