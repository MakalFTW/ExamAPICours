Feature: This feature tests Clickup API

  Scenario: Create a folder and add a list to it
    Given Test board exists and the name is "APITests"
    When I create a folder and name it "TestFolder"
    And I create a list named "TestList" in the folder
    Then I check that the list was created and named "TestList"
