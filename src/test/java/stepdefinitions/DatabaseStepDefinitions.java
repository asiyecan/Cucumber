package stepdefinitions;

import com.mongodb.DB;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.DBUtils;

import java.sql.SQLException;

public class DatabaseStepDefinitions {
    @Given("user connects to the application database")
    public void user_connects_to_the_application_database() {
//        creating database connections using database utility class
        DBUtils.createConnection();
    }
    @Given("user gets the column {string} from table {string}")
    public void user_gets_the_column_from_table(String column, String table) {
//        String query = "SELECT * FROM jhi_user";//HARD CODED
        String query = "SELECT "+column+" FROM "+table+" Order By Id";//DYNAMIC QUERY
//        Running the query using util class
        DBUtils.executeQuery(query);
    }
    @Then("user reads all the column {string} data")
    public void user_reads_all_the_column_data(String column) throws Exception {
//        Using result set, get teh objects from the database
        DBUtils.getResultset().next();//going to the next row
        Object object1 = DBUtils.getResultset().getObject(column);//getObject is used to get the database objects
        System.out.println(object1);
//        -----------
        DBUtils.getResultset().next();//going to the next row
        Object object2=DBUtils.getResultset().getObject(column);
        System.out.println(object2);
//        -----------------
        DBUtils.getResultset().next();//going to the next row
        Object object3=DBUtils.getResultset().getObject(column);
        System.out.println(object3);
//        --------------------
        DBUtils.getResultset().next();//going to the next row
        Object object4=DBUtils.getResultset().getObject(column);
        System.out.println(object4);

        int rowNum=4;
        while (DBUtils.getResultset().next()){//continue to go to the next row until there is no more row exist
            Object currentRowObject = DBUtils.getResultset().getObject(column);
            System.out.println("Row "+rowNum+" data => "+currentRowObject);
            rowNum++;

        }

        System.out.println("Row Count : "+rowNum);
        System.out.println("Row Counr : "+DBUtils.getRowCount());


    }
}