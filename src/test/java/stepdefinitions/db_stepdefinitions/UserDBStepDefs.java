package stepdefinitions.db_stepdefinitions;

import io.cucumber.java.en.*;
import utilities.DBUtils;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class UserDBStepDefs {
    List<Object> columnList;

    @Given("user connects to database")
    public void user_connects_to_database() {

        DBUtils.createConnection();
    }

    @When("get all {string} as a list from {string}")
    public void getAllAsAListFrom(String columnName, String tableName) {

        String query = "SELECT * FROM " + tableName;
        columnList = DBUtils.getColumnData(query, columnName);
        System.out.println("columnList = " + columnList);

    }

    @Then("verify usernamelist contains {string}")
    public void verify_usernamelist_contains(String username) {

        assertTrue(columnList.contains(username));
    }

    @Then("close the connection")
    public void close_the_connection() {
        DBUtils.closeConnection();
    }

    @Then("verify list contains {string}")
    public void verifyListContains(String data) {

        assertTrue(columnList.contains(Integer.valueOf(data)));

    }
}


