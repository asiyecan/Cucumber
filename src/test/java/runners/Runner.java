package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/resources/features",//PATH OF FEATURES FOLDER
        glue = "stepdefinitions" //PATH OF STEP DEFINITIONS
)
public class Runner {
}