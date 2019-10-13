# example on how to pass data from feature file
@branch
Feature: As a admin I want to create a new branch so that I can see branch created succesfully message

  Background: 
    Given admin is in bank home page
    And admin is in admin home page by doing valid login
    And admin is in branch details page by clicking branches button
    And admin is in branch creation page by clicking new branch button

	@branch_create_valid
  Scenario: Branch creation with valid data
    When admin enters valid branch name "jersybranch"
    And admin enters valid address1 "king street"
    And admin enters valid zipcode "12345"
    And admin selects country as "USA"
    And admin selects state as "NewYork"
    And admin selects city as "Rochestor"
    And admin clicks on submit button
    Then admin can see a message saying new branch created successfully with some id

	@branch_reset @dd
  Scenario Outline: Branch creation reset with valid multiple sets of data
    When admin enters valid branch name "<branch_name>"
    And admin enters valid address1 "<address1>"
    And admin enters valid zipcode "<zipcode>"
    And admin selects country as "<country>"
    And admin selects state as "<state>"
    And admin selects city as "<city>"
    And admin clicks on reset button
    Then admin can see an empty creation form

    Examples: 
      | branch_name           | address1         | zipcode | country | state   | city      |
      | manchesterbranchOne   | mainOne street   |   23456 | USA     | NewYork | Rochestor |
      | manchesterbranchTwo   | mainTwo street   |   23456 | USA     | NewYork | Rochestor |
      | manchesterbranchThree | mainThree street |   23456 | USA     | NewYork | Rochestor |
      | manchesterbranchFour  | mainfour street  |   23456 | USA     | NewYork | Rochestor |
      | manchesterbranchFive  | mainFive street  |   23456 | USA     | NewYork | Rochestor |

      
   