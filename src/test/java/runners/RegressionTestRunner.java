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
        features = "./src/test/resources/features",
        glue = {"stepdefinitions"},
        dryRun = false,
        tags = "@data_tables_1"
)
public class RegressionTestRunner {

        /*
        Did you do parallel testing in you project?
        Yes I did.
        How do you parallel testing?
        My current project is cucumber framework. We have pom.xml configuration for parallel testing.
        I have multiple runner with specific tags for parallel testing. For example, Create reservation runner, smoke test runner, regression test runner, and add inventory runner can be run in parallel. When needed I use those runner as well.
        What are the required plugin for parallel?
        maven failsafe(safe run even after some test failure), maven surefire(For parallel testing-thread count is in this plugin), and maven cucumber reporting(generation reports)
        When did you do parallel testing?
        I normally don’t do parallel testing in the sprints. But if I do regression testing, I can do parallel testing to save time.
         */
}