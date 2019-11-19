@role
Feature: As a admin I want to create a role so that I can see role created successfully

  Background: 
    Given admin is in bank home page
    And admin is in admin home page by doing valid login
    And admin is in role details page by clicking roles button
    And admin is in role creation page by clicking new role button
	@role_create @invalid @dd
  Scenario: Role creation with invalid role name
    When admin enters invalid role name then admin can see an error message
      | role_name |
      | role123   |
      | role@23   |
      | role.$#   |
      |   1234567 |
      | *&^%$#    |

	@role_reset @dd
  Scenario: Role creation reset with multiple sets of data
    When admin clicks reset button after filling role creation form then admin can see an empty form
      | role_name | role_type |
      | roleOne   | E         |
      | roleTwo   | E         |
      | roleThree | E         |
      | roleFour  | E         |
      | roleFive  | E         |

   @role_excel
  Scenario: Role creation reset with data from excel file
    When admin clicks reset button after filling role creation data by taking data from a excel file
       |folderName|fileName|sheetName|
       |resources| testdata.xls|roleData    |
