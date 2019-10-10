$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/branchCreation.feature");
formatter.feature({
  "name": "As a admin I want to create a new branch so that I can see branch created succesfully message",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Branch creation with valid data",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "admin is in bank home page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.admin_is_in_bank_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "admin is in admin home page by doing valid login",
  "keyword": "And "
});
formatter.match({
  "location": "BranchCreationSteps.admin_is_in_admin_home_page_by_doing_valid_login()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat banking.cucumber_framework.BankHomePage.username(BankHomePage.java:12)\r\n\tat banking.cucumber_framework.BankHomePage.fillUserName(BankHomePage.java:31)\r\n\tat stepdefinition.BranchCreationSteps.admin_is_in_admin_home_page_by_doing_valid_login(BranchCreationSteps.java:26)\r\n\tat ✽.admin is in admin home page by doing valid login(file:src/test/java/features/branchCreation.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "admin is in branch details page by clicking branches button",
  "keyword": "And "
});
formatter.match({
  "location": "BranchCreationSteps.admin_is_in_branch_details_page_by_clicking_branches_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "admin is in branch creation page by clicking new branch button",
  "keyword": "And "
});
formatter.match({
  "location": "BranchCreationSteps.admin_is_in_branch_creation_page_by_clicking_new_branch_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "admin enters valid branch name \"jersybranch\"",
  "keyword": "When "
});
formatter.match({
  "location": "BranchCreationSteps.admin_enters_valid_branch_name(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "admin enters valid address1 \"king street\"",
  "keyword": "And "
});
formatter.match({
  "location": "BranchCreationSteps.admin_enters_valid_address1(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "admin enters valid zipcode \"12345\"",
  "keyword": "And "
});
formatter.match({
  "location": "BranchCreationSteps.admin_enters_valid_zipcode(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "admin selects country as \"USA\"",
  "keyword": "And "
});
formatter.match({
  "location": "BranchCreationSteps.admin_selects_country_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "admin selects state as \"NewYork\"",
  "keyword": "And "
});
formatter.match({
  "location": "BranchCreationSteps.admin_selects_state_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "admin selects city as \"Rochestor\"",
  "keyword": "And "
});
formatter.match({
  "location": "BranchCreationSteps.admin_selects_city_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "admin clicks on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "BranchCreationSteps.admin_clicks_on_submit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "admin can see a message saying new branch created successfully with some id",
  "keyword": "Then "
});
formatter.match({
  "location": "BranchCreationSteps.admin_can_see_a_message_saying_new_branch_created_successfully_with_some_id()"
});
formatter.result({
  "status": "skipped"
});
});