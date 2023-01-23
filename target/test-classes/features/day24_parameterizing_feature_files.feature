@parametrizing1
Feature: Search_Feature
  Background: user_goes_to_google_page
    Given user is on the google home page
  Scenario: TC01_tesla_search
    When user search for "tesla" on google
    Then verify page title contains "tesla"
    Then close the application
#      "" is used to parametrize feature file