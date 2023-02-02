@db_read
Feature: db_customer_testing
  Scenario: TC01_read_customer_ssn_info
    Given user connects to the application database
#    Select * from jhi_user
    And user gets the column "*" from table "jhi_user"
#    read all of the login names of the customer
    Then user reads all the column "login" data

#PRINT THE USERS FIRST NAMES
  Scenario: TC02_read_customer_firstname_info
    Given user connects to the application database
#    Select * from jhi_user
    And user gets the column "*" from table "jhi_user"
#    read all of the login names of the customer
    Then user reads all the column "first_name" data