# example on how to pass data from feature file
Feature: As a admin I want to create a new branch so that I can see branch created succesfully message

  Scenario: Branch creation with valid data
    Given admin is in bank home page
    And admin is in admin home page by doing valid login
    And admin is in branch details page by clicking branches button
    And admin is in branch creation page by clicking new branch button
    When admin enters valid branch name "jersybranch"
    And admin enters valid address1 "king street"
    And admin enters valid zipcode "12345"
    And admin selects country as "USA"
    And admin selects state as "NewYork"
    And admin selects city as "Rochestor"
    And admin clicks on submit button
    Then admin can see a message saying new branch created successfully with some id
