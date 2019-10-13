Feature: As a admin I want to create a role so that I can see role created successfully

  Background: 
    Given admin is in bank home page
    And admin is in admin home page by doing valid login
    And admin is in role details page by clicking roles button
    And admin is in role creation page by clicking new role button

  Scenario: Role creation with invalid role name
    When admin enters invalid role name then admin can see an error message
      | role_name |
      | role123   |
      | role@23   |
      | role.$#   |
      |   1234567 |
      | *&^%$#    |
