#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)

@login
Feature: As a Admin I want to do login so that I can see Admin home page with logut link

  Background: 
    Given admin is in bank home page

  @login_valid @valid
  Scenario: Login with valid credentials
    When admin enters valid username
    And admin enters valid password
    And click on login button
    Then user can see welcome to Admin message with logout link

  @login_invalid_pass @invalid
  Scenario: Login with invalid password
    When admin enters valid username
    But admin enters invalid password
    And click on login button
    Then admin can see an error message saying incorrect bankername or password

  @login_invalid_user @invalid
  Scenario: Login with invalid username
    When admin enters invalid user name
    And admin enters valid password
    And click on login button
    Then admin can see an error message saying incorrect bankername or password

  @login_blank @invalid
  Scenario: Loign without filling credentials
    When click on login button
    Then admin can see an error message saying please fill fillowing fields
