Feature: first feature file
  Scenario: TC_01_first_scenario
    Given user is on the google home page
    When user search for iPhone
    Then verify page title contains iPhone
#  All feature files must begin with "Feature:" keyword
#  Feature : To declare the file as a cucumber feature file. Mandatory. There can be ONLY one Feature: keyword
#  Scenario : To create test case. In a feature file there may be more than one Scenario:
#  Runner : To run the feature files.