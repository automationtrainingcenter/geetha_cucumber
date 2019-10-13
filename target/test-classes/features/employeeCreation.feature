@employee
Feature: Employee creation

  Background: 
    Given admin is in bank home page
    And admin is in admin home page by doing valid login
    And admin is in employee details page by clicking employee button
    And admin is in employee creation page by clicking new employee button

	@employee_reset @json @dd
  Scenario: employee creation reset using json data
  	When admin clicks on reset button by filling form with data from json then form must reset
  	
