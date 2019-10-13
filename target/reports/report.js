$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/roleCreation.feature");
formatter.feature({
  "name": "As a admin I want to create a role so that I can see role created successfully",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@role"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
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
  "status": "passed"
});
formatter.step({
  "name": "admin is in role details page by clicking roles button",
  "keyword": "And "
});
formatter.match({
  "location": "RoleCreationSteps.admin_is_in_role_details_page_by_clicking_roles_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "admin is in role creation page by clicking new role button",
  "keyword": "And "
});
formatter.match({
  "location": "RoleCreationSteps.admin_is_in_role_creation_page_by_clicking_new_role_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Role creation reset with multiple sets of data",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@role"
    },
    {
      "name": "@role_reset"
    },
    {
      "name": "@dd"
    }
  ]
});
formatter.step({
  "name": "admin clicks reset button after filling role creation form then admin can see an empty form",
  "rows": [
    {
      "cells": [
        "role_name",
        "role_type"
      ]
    },
    {
      "cells": [
        "roleOne",
        "E"
      ]
    },
    {
      "cells": [
        "roleTwo",
        "E"
      ]
    },
    {
      "cells": [
        "roleThree",
        "E"
      ]
    },
    {
      "cells": [
        "roleFour",
        "E"
      ]
    },
    {
      "cells": [
        "roleFive",
        "E"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "RoleCreationSteps.admin_clicks_reset_button_after_filling_role_creation_form_then_admin_can_see_an_empty_form(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});