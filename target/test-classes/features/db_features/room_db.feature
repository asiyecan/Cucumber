@Room_DB
Feature: Room Validation

  Scenario: Validate Room by Room Number
    Given user connects to database
    When get all "room_number" as a list from "room"
    Then verify usernamelist contains "75634221"
    And close the connection