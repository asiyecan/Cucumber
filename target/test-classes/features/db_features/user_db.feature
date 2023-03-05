@user_db
 Feature: User Validation

   Scenario: Validate user by login/username
     Given user connects to database
     When get all "email" as a list from "jhi_user"
     Then verify usernamelist contains "john_doeexample123@gmail.com"
     And close the connection