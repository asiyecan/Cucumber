package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;
public class GoogleStepDefinitions {
    GooglePage googlePage = new GooglePage();
    @Given("user is on the google home page")
    public void user_is_on_the_google_home_page() {
//        WRITE THE JAVA CODE
        Driver.getDriver().get(ConfigReader.getProperty("google_url"));
        try{
            googlePage.popUpAccept.click();//accept pop up if visible. Catch the error and continue if not visible
        }catch (Exception e){
        }
    }
    @When("user search for iPhone")
    public void user_search_for_i_phone() {
        googlePage.searchBox.sendKeys("iPhone"+ Keys.ENTER);
    }
    @Then("verify page title contains iPhone")
    public void verify_page_title_contains_i_phone() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("iPhone"));
    }
}