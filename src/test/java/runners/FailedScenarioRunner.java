package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt"
        },
        monochrome=true,
        features = "@target/failedRerun.txt",
        glue = {"stepdefinitions", "hooks"},
        dryRun = false

)
public class FailedScenarioRunner {
}
/*
This runner class is used to run only failedRerun.txt file
That file only has failed scenarios if any scenario fails
That file will be empty if no scenario fails
We do not use tag or path of the features folder
 */