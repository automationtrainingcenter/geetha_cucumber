$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/roleCreation.feature");
formatter.feature({
  "name": "As a admin I want to create a role so that I can see role created successfully",
  "description": "",
  "keyword": "Feature"
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
  "name": "Role creation with invalid role name",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "admin enters invalid role name then admin can see an error message",
  "rows": [
    {
      "cells": [
        "role_name"
      ]
    },
    {
      "cells": [
        "role123"
      ]
    },
    {
      "cells": [
        "role@23"
      ]
    },
    {
      "cells": [
        "role.$#"
      ]
    },
    {
      "cells": [
        "1234567"
      ]
    },
    {
      "cells": [
        "*\u0026^%$#"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "RoleCreationSteps.admin_enters_invalid_role_name_then_admin_can_see_an_error_message(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});