$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/feature/RetailWebsiteFeature.feature");
formatter.feature({
  "name": "Retail website",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Validate ReturnID field",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ReturnID"
    }
  ]
});
formatter.step({
  "name": "Admin is on Product Return Page",
  "keyword": "Given "
});
formatter.step({
  "name": "Admin enter valid input \"\u003cValidReturnIDInput\u003e\" into ReturnID",
  "keyword": "When "
});
formatter.step({
  "name": "Admin Clicks on filter button",
  "keyword": "And "
});
formatter.step({
  "name": "Verify if Admin is able to see record based on the given input \"\u003cValidReturnIDInput\u003e\" in ReturnID",
  "keyword": "Then "
});
formatter.step({
  "name": "Admin enter invalid input \"\u003cInvalidReturnIDInput\u003e\" into ReturnID",
  "keyword": "When "
});
formatter.step({
  "name": "Admin Clicks on filter button",
  "keyword": "And "
});
formatter.step({
  "name": "Verify if Admin is not able to see any record",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "ValidReturnIDInput",
        "InvalidReturnIDInput"
      ]
    },
    {
      "cells": [
        "380",
        "ABC"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "Admin is on Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_is_on_Login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin enter username and password",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_enter_username_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_clicks_on_Login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify if Admin is successfully logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.verify_if_admin_is_successfully_logged_in()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on menu",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.click_on_menu()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin clicks on Sales dropdown",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_clicks_on_Sales_dropdown()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin clicks on Return option",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_clicks_on_Return_option()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify if Admin in on Product Return page",
  "keyword": "Then "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.verify_if_Admin_in_on_Product_Return_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Validate ReturnID field",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ReturnID"
    }
  ]
});
formatter.step({
  "name": "Admin is on Product Return Page",
  "keyword": "Given "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_is_on_Product_Return_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin enter valid input \"380\" into ReturnID",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_enter_valid_input_into_ReturnID(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin Clicks on filter button",
  "keyword": "And "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_Clicks_on_filter_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify if Admin is able to see record based on the given input \"380\" in ReturnID",
  "keyword": "Then "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.verify_if_Admin_is_able_to_see_record_based_on_the_given_input_in_ReturnID(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin enter invalid input \"ABC\" into ReturnID",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_enter_invalid_input_into_ReturnID(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin Clicks on filter button",
  "keyword": "And "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_Clicks_on_filter_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify if Admin is not able to see any record",
  "keyword": "Then "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.verify_if_Admin_is_not_able_to_see_any_record()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "Validate OrderID field",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@OrderID"
    }
  ]
});
formatter.step({
  "name": "Admin is on Product Return Page",
  "keyword": "Given "
});
formatter.step({
  "name": "Admin enter valid input \"\u003cValidOrderIDInput\u003e\" into OrderID",
  "keyword": "When "
});
formatter.step({
  "name": "Admin Clicks on filter button",
  "keyword": "And "
});
formatter.step({
  "name": "Verify if Admin is able to see record based on the given input \"\u003cValidOrderIDInput\u003e\" in OrderID",
  "keyword": "Then "
});
formatter.step({
  "name": "Admin enter invalid input \"\u003cInvalidOrderIDInput\u003e\" into OrderID",
  "keyword": "When "
});
formatter.step({
  "name": "Admin Clicks on filter button",
  "keyword": "And "
});
formatter.step({
  "name": "Verify if Admin is not able to see any record",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "ValidOrderIDInput",
        "InvalidOrderIDInput"
      ]
    },
    {
      "cells": [
        "450",
        "ABC"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "Admin is on Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_is_on_Login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin enter username and password",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_enter_username_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_clicks_on_Login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify if Admin is successfully logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.verify_if_admin_is_successfully_logged_in()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on menu",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.click_on_menu()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin clicks on Sales dropdown",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_clicks_on_Sales_dropdown()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin clicks on Return option",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_clicks_on_Return_option()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify if Admin in on Product Return page",
  "keyword": "Then "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.verify_if_Admin_in_on_Product_Return_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Validate OrderID field",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@OrderID"
    }
  ]
});
formatter.step({
  "name": "Admin is on Product Return Page",
  "keyword": "Given "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_is_on_Product_Return_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin enter valid input \"450\" into OrderID",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_enter_valid_input_into_OrderID(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin Clicks on filter button",
  "keyword": "And "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_Clicks_on_filter_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify if Admin is able to see record based on the given input \"450\" in OrderID",
  "keyword": "Then "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.verify_if_Admin_is_able_to_see_record_based_on_the_given_input_in_OrderID(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin enter invalid input \"ABC\" into OrderID",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_enter_invalid_input_into_OrderID(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin Clicks on filter button",
  "keyword": "And "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_Clicks_on_filter_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify if Admin is not able to see any record",
  "keyword": "Then "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.verify_if_Admin_is_not_able_to_see_any_record()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "Validate CustomerName field",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@CustomerName"
    }
  ]
});
formatter.step({
  "name": "Admin is on Product Return Page",
  "keyword": "Given "
});
formatter.step({
  "name": "Admin enter valid input \"\u003cValidCustomerNameInput\u003e\" into CustomerName",
  "keyword": "When "
});
formatter.step({
  "name": "Admin Clicks on filter button",
  "keyword": "And "
});
formatter.step({
  "name": "Verify if Admin is able to see record based on the given input \"\u003cValidCustomerNameInput\u003e\" in CustomerName",
  "keyword": "Then "
});
formatter.step({
  "name": "Admin enter invalid input \"\u003cInvalidCustomerNameInput\u003e\" into CustomerName",
  "keyword": "When "
});
formatter.step({
  "name": "Admin Clicks on filter button",
  "keyword": "And "
});
formatter.step({
  "name": "Verify if Admin is not able to see any record",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "ValidCustomerNameInput",
        "InvalidCustomerNameInput"
      ]
    },
    {
      "cells": [
        "Vaibhavi Bagat",
        "+123ABC"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "Admin is on Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_is_on_Login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin enter username and password",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_enter_username_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_clicks_on_Login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify if Admin is successfully logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.verify_if_admin_is_successfully_logged_in()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on menu",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.click_on_menu()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin clicks on Sales dropdown",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_clicks_on_Sales_dropdown()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin clicks on Return option",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_clicks_on_Return_option()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify if Admin in on Product Return page",
  "keyword": "Then "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.verify_if_Admin_in_on_Product_Return_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Validate CustomerName field",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@CustomerName"
    }
  ]
});
formatter.step({
  "name": "Admin is on Product Return Page",
  "keyword": "Given "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_is_on_Product_Return_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin enter valid input \"Vaibhavi Bagat\" into CustomerName",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_enter_valid_input_into_CustomerName(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin Clicks on filter button",
  "keyword": "And "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_Clicks_on_filter_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify if Admin is able to see record based on the given input \"Vaibhavi Bagat\" in CustomerName",
  "keyword": "Then "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.verify_if_Admin_is_able_to_see_record_based_on_the_given_input_in_CustomerName(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin enter invalid input \"+123ABC\" into CustomerName",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_enter_invalid_input_into_CustomerName(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin Clicks on filter button",
  "keyword": "And "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_Clicks_on_filter_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify if Admin is not able to see any record",
  "keyword": "Then "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.verify_if_Admin_is_not_able_to_see_any_record()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "Validate ProductName field",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ProductName"
    }
  ]
});
formatter.step({
  "name": "Admin is on Product Return Page",
  "keyword": "Given "
});
formatter.step({
  "name": "Admin enter valid input \"\u003cValidProductNameInput\u003e\" into ProductName",
  "keyword": "When "
});
formatter.step({
  "name": "Admin Clicks on filter button",
  "keyword": "And "
});
formatter.step({
  "name": "Verify if Admin is able to see record based on the given input \"\u003cValidProductNameInput\u003e\" in ProductName",
  "keyword": "Then "
});
formatter.step({
  "name": "Admin enter invalid input \"\u003cInvalidProductNameInput\u003e\" into ProductName",
  "keyword": "When "
});
formatter.step({
  "name": "Admin Clicks on filter button",
  "keyword": "And "
});
formatter.step({
  "name": "Verify if Admin is not able to see any record",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "ValidProductNameInput",
        "InvalidProductNameInput"
      ]
    },
    {
      "cells": [
        "Laptop",
        "+123ABC"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "Admin is on Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_is_on_Login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin enter username and password",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_enter_username_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_clicks_on_Login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify if Admin is successfully logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.verify_if_admin_is_successfully_logged_in()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on menu",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.click_on_menu()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin clicks on Sales dropdown",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_clicks_on_Sales_dropdown()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin clicks on Return option",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_clicks_on_Return_option()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify if Admin in on Product Return page",
  "keyword": "Then "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.verify_if_Admin_in_on_Product_Return_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Validate ProductName field",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ProductName"
    }
  ]
});
formatter.step({
  "name": "Admin is on Product Return Page",
  "keyword": "Given "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_is_on_Product_Return_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin enter valid input \"Laptop\" into ProductName",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_enter_valid_input_into_ProductName(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin Clicks on filter button",
  "keyword": "And "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_Clicks_on_filter_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify if Admin is able to see record based on the given input \"Laptop\" in ProductName",
  "keyword": "Then "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.verify_if_Admin_is_able_to_see_record_based_on_the_given_input_in_ProductName(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin enter invalid input \"+123ABC\" into ProductName",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_enter_invalid_input_into_ProductName(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin Clicks on filter button",
  "keyword": "And "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_Clicks_on_filter_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify if Admin is not able to see any record",
  "keyword": "Then "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.verify_if_Admin_is_not_able_to_see_any_record()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "Validate ModelName field",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ModelName"
    }
  ]
});
formatter.step({
  "name": "Admin is on Product Return Page",
  "keyword": "Given "
});
formatter.step({
  "name": "Admin enter valid input \"\u003cValidModelNameInput\u003e\" into ModelName",
  "keyword": "When "
});
formatter.step({
  "name": "Admin Clicks on filter button",
  "keyword": "And "
});
formatter.step({
  "name": "Verify if Admin is able to see record based on the given input \"\u003cValidModelNameInput\u003e\" in ModelName",
  "keyword": "Then "
});
formatter.step({
  "name": "Admin enter invalid input \"\u003cInvalidModelNameInput\u003e\" into ModelName",
  "keyword": "When "
});
formatter.step({
  "name": "Admin Clicks on filter button",
  "keyword": "And "
});
formatter.step({
  "name": "Verify if Admin is not able to see any record",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "ValidModelNameInput",
        "InvalidModelNameInput"
      ]
    },
    {
      "cells": [
        "AP001",
        "+123ABC"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "Admin is on Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_is_on_Login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin enter username and password",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_enter_username_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_clicks_on_Login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify if Admin is successfully logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.verify_if_admin_is_successfully_logged_in()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on menu",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.click_on_menu()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin clicks on Sales dropdown",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_clicks_on_Sales_dropdown()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin clicks on Return option",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_clicks_on_Return_option()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify if Admin in on Product Return page",
  "keyword": "Then "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.verify_if_Admin_in_on_Product_Return_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Validate ModelName field",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ModelName"
    }
  ]
});
formatter.step({
  "name": "Admin is on Product Return Page",
  "keyword": "Given "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_is_on_Product_Return_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin enter valid input \"AP001\" into ModelName",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_enter_valid_input_into_ModelName(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin Clicks on filter button",
  "keyword": "And "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_Clicks_on_filter_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify if Admin is able to see record based on the given input \"AP001\" in ModelName",
  "keyword": "Then "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.verify_if_Admin_is_able_to_see_record_based_on_the_given_input_in_ModelName(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin enter invalid input \"+123ABC\" into ModelName",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_enter_invalid_input_into_ModelName(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin Clicks on filter button",
  "keyword": "And "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_Clicks_on_filter_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify if Admin is not able to see any record",
  "keyword": "Then "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.verify_if_Admin_is_not_able_to_see_any_record()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "Validate ReturnStatus field",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ReturnStatus"
    }
  ]
});
formatter.step({
  "name": "Admin is on Product Return Page",
  "keyword": "Given "
});
formatter.step({
  "name": "Admin select one option \"\u003cValidReturnStatusInput\u003e\" from the ReturnStatus dropdown",
  "keyword": "When "
});
formatter.step({
  "name": "Verify if Admin is able to see selected option \"\u003cValidReturnStatusInput\u003e\" in ReturnStatus",
  "keyword": "Then "
});
formatter.step({
  "name": "Admin Clicks on filter button",
  "keyword": "And "
});
formatter.step({
  "name": "Verify if Admin is able to see record based on the selected option \"\u003cValidReturnStatusInput\u003e\" in ReturnStatus",
  "keyword": "Then "
});
formatter.step({
  "name": "Admin enters intial of \"\u003cValidReturnStatusInput\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Clicks on enter button",
  "keyword": "And "
});
formatter.step({
  "name": "Verify if Admin is able to see selected option \"\u003cValidReturnStatusInput\u003e\" in ReturnStatus if initial letter is entered",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "ValidReturnStatusInput",
        "InvalidReturnStatusInput"
      ]
    },
    {
      "cells": [
        "Pending",
        "+123ABC"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "Admin is on Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_is_on_Login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin enter username and password",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_enter_username_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_clicks_on_Login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify if Admin is successfully logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.verify_if_admin_is_successfully_logged_in()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on menu",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.click_on_menu()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin clicks on Sales dropdown",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_clicks_on_Sales_dropdown()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin clicks on Return option",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_clicks_on_Return_option()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify if Admin in on Product Return page",
  "keyword": "Then "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.verify_if_Admin_in_on_Product_Return_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Validate ReturnStatus field",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ReturnStatus"
    }
  ]
});
formatter.step({
  "name": "Admin is on Product Return Page",
  "keyword": "Given "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_is_on_Product_Return_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin select one option \"Pending\" from the ReturnStatus dropdown",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_select_one_option_from_the_ReturnStatus_dropdown(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify if Admin is able to see selected option \"Pending\" in ReturnStatus",
  "keyword": "Then "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.verify_if_Admin_is_able_to_see_selected_option_in_ReturnStatus(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin Clicks on filter button",
  "keyword": "And "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_Clicks_on_filter_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify if Admin is able to see record based on the selected option \"Pending\" in ReturnStatus",
  "keyword": "Then "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.verify_if_Admin_is_able_to_see_record_based_on_the_selected_option_in_ReturnStatus(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin enters intial of \"Pending\"",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_enters_intial_of(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Clicks on enter button",
  "keyword": "And "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.clicks_on_enter_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify if Admin is able to see selected option \"Pending\" in ReturnStatus if initial letter is entered",
  "keyword": "Then "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.verify_if_Admin_is_able_to_see_selected_option_in_ReturnStatus_if_initial_letter_is_entered(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "Verify Tabel view",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TabelView"
    }
  ]
});
formatter.step({
  "name": "Admin is on Product Return Page",
  "keyword": "Given "
});
formatter.step({
  "name": "Admin Clicks on filter button",
  "keyword": "And "
});
formatter.step({
  "name": "Verify if admin is able to see all columns \"\u003ccolumn1\u003e\", \"\u003ccolumn2\u003e\", \"\u003ccolumn3\u003e\", \"\u003ccolumn4\u003e\", \"\u003ccolumn5\u003e\", \"\u003ccolumn6\u003e\", \"\u003ccolumn7\u003e\", \"\u003ccolumn8\u003e\", \"\u003ccolumn9\u003e\" and \"\u003ccolumn10\u003e\" of the tabel",
  "keyword": "Then "
});
formatter.step({
  "name": "Admin clicks on table header column Return ID",
  "keyword": "When "
});
formatter.step({
  "name": "Verify if Return ID column get sorted in Ascending Order",
  "keyword": "Then "
});
formatter.step({
  "name": "Admin clicks on table header column Return ID",
  "keyword": "When "
});
formatter.step({
  "name": "Verify if Return ID column get sorted in Descending Order",
  "keyword": "Then "
});
formatter.step({
  "name": "Admin clicks on table header column Order ID",
  "keyword": "When "
});
formatter.step({
  "name": "Verify if Order ID column get sorted in Ascending Order",
  "keyword": "Then "
});
formatter.step({
  "name": "Admin clicks on table header column Order ID",
  "keyword": "When "
});
formatter.step({
  "name": "Verify if Order ID column get sorted in Descending Order",
  "keyword": "Then "
});
formatter.step({
  "name": "Admin clicks on table header column Customer",
  "keyword": "When "
});
formatter.step({
  "name": "Verify if Customer column get sorted in Ascending Order",
  "keyword": "Then "
});
formatter.step({
  "name": "Admin clicks on table header column Customer",
  "keyword": "When "
});
formatter.step({
  "name": "Verify if Customer column get sorted in Descending Order",
  "keyword": "Then "
});
formatter.step({
  "name": "Admin clicks on table header column Product",
  "keyword": "When "
});
formatter.step({
  "name": "Verify if Product column get sorted in Ascending Order",
  "keyword": "Then "
});
formatter.step({
  "name": "Admin clicks on table header column Product",
  "keyword": "When "
});
formatter.step({
  "name": "Verify if Product column get sorted in Descending Order",
  "keyword": "Then "
});
formatter.step({
  "name": "Admin clicks on table header column Model",
  "keyword": "When "
});
formatter.step({
  "name": "Verify if Model column get sorted in Ascending Order",
  "keyword": "Then "
});
formatter.step({
  "name": "Admin clicks on table header column Model",
  "keyword": "When "
});
formatter.step({
  "name": "Verify if Model column get sorted in Descending Order",
  "keyword": "Then "
});
formatter.step({
  "name": "Admin clicks on table header column Status",
  "keyword": "When "
});
formatter.step({
  "name": "Verify if Status column get sorted in Ascending Order",
  "keyword": "Then "
});
formatter.step({
  "name": "Admin clicks on table header column Status",
  "keyword": "When "
});
formatter.step({
  "name": "Verify if Status column get sorted in Descending Order",
  "keyword": "Then "
});
formatter.step({
  "name": "Admin clicks on table header column Date Added",
  "keyword": "When "
});
formatter.step({
  "name": "Verify if Date Added column get sorted in Ascending Order",
  "keyword": "Then "
});
formatter.step({
  "name": "Admin clicks on table header column Date Added",
  "keyword": "When "
});
formatter.step({
  "name": "Verify if Date Added column get sorted in Descending Order",
  "keyword": "Then "
});
formatter.step({
  "name": "Admin clicks on table header column Date Modified",
  "keyword": "When "
});
formatter.step({
  "name": "Verify if Date Modified column get sorted in Ascending Order",
  "keyword": "Then "
});
formatter.step({
  "name": "Admin clicks on table header column Date Modified",
  "keyword": "When "
});
formatter.step({
  "name": "Verify if Date Modified column get sorted in Descending Order",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "column1",
        "column2",
        "column3",
        "column4",
        "column5",
        "column6",
        "column7",
        "column8",
        "column9",
        "column10"
      ]
    },
    {
      "cells": [
        "",
        "Return ID",
        "Order ID",
        "Customer",
        "Product",
        "Model",
        "Status",
        "Date Added",
        "Date Modified",
        "Action"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "Admin is on Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_is_on_Login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin enter username and password",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_enter_username_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_clicks_on_Login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify if Admin is successfully logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.verify_if_admin_is_successfully_logged_in()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on menu",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.click_on_menu()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin clicks on Sales dropdown",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_clicks_on_Sales_dropdown()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin clicks on Return option",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_clicks_on_Return_option()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify if Admin in on Product Return page",
  "keyword": "Then "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.verify_if_Admin_in_on_Product_Return_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Verify Tabel view",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TabelView"
    }
  ]
});
formatter.step({
  "name": "Admin is on Product Return Page",
  "keyword": "Given "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_is_on_Product_Return_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin Clicks on filter button",
  "keyword": "And "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_Clicks_on_filter_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify if admin is able to see all columns \"\", \"Return ID\", \"Order ID\", \"Customer\", \"Product\", \"Model\", \"Status\", \"Date Added\", \"Date Modified\" and \"Action\" of the tabel",
  "keyword": "Then "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.verify_if_admin_is_able_to_see_all_columns_and_of_the_tabel(String,String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin clicks on table header column Return ID",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_clicks_on_table_header_column_Return_ID()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify if Return ID column get sorted in Ascending Order",
  "keyword": "Then "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.verify_if_Return_ID_column_get_sorted_in_Ascending_Order()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin clicks on table header column Return ID",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_clicks_on_table_header_column_Return_ID()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify if Return ID column get sorted in Descending Order",
  "keyword": "Then "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.verify_if_Return_ID_column_get_sorted_in_Descending_Order()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin clicks on table header column Order ID",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_clicks_on_table_header_column_Order_ID()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify if Order ID column get sorted in Ascending Order",
  "keyword": "Then "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.verify_if_Order_ID_column_get_sorted_in_Ascending_Order()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin clicks on table header column Order ID",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_clicks_on_table_header_column_Order_ID()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify if Order ID column get sorted in Descending Order",
  "keyword": "Then "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.verify_if_Order_ID_column_get_sorted_in_Descending_Order()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin clicks on table header column Customer",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_clicks_on_table_header_column_Customer()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify if Customer column get sorted in Ascending Order",
  "keyword": "Then "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.verify_if_Customer_column_get_sorted_in_Ascending_Order()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin clicks on table header column Customer",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_clicks_on_table_header_column_Customer()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify if Customer column get sorted in Descending Order",
  "keyword": "Then "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.verify_if_Customer_column_get_sorted_in_Descending_Order()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin clicks on table header column Product",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_clicks_on_table_header_column_Product()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify if Product column get sorted in Ascending Order",
  "keyword": "Then "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.verify_if_Product_column_get_sorted_in_Ascending_Order()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin clicks on table header column Product",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_clicks_on_table_header_column_Product()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify if Product column get sorted in Descending Order",
  "keyword": "Then "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.verify_if_Product_column_get_sorted_in_Descending_Order()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin clicks on table header column Model",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_clicks_on_table_header_column_Model()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify if Model column get sorted in Ascending Order",
  "keyword": "Then "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.verify_if_Model_column_get_sorted_in_Ascending_Order()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin clicks on table header column Model",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_clicks_on_table_header_column_Model()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify if Model column get sorted in Descending Order",
  "keyword": "Then "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.verify_if_Model_column_get_sorted_in_Descending_Order()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin clicks on table header column Status",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_clicks_on_table_header_column_Status()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify if Status column get sorted in Ascending Order",
  "keyword": "Then "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.verify_if_Status_column_get_sorted_in_Ascending_Order()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin clicks on table header column Status",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_clicks_on_table_header_column_Status()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify if Status column get sorted in Descending Order",
  "keyword": "Then "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.verify_if_Status_column_get_sorted_in_Descending_Order()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin clicks on table header column Date Added",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_clicks_on_table_header_column_Date_Added()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify if Date Added column get sorted in Ascending Order",
  "keyword": "Then "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.verify_if_Date_Added_column_get_sorted_in_Ascending_Order()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin clicks on table header column Date Added",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_clicks_on_table_header_column_Date_Added()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify if Date Added column get sorted in Descending Order",
  "keyword": "Then "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.verify_if_Date_Added_column_get_sorted_in_Descending_Order()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin clicks on table header column Date Modified",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_clicks_on_table_header_column_Date_Modified()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify if Date Modified column get sorted in Ascending Order",
  "keyword": "Then "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.verify_if_Date_Modified_column_get_sorted_in_Ascending_Order()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Admin clicks on table header column Date Modified",
  "keyword": "When "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.admin_clicks_on_table_header_column_Date_Modified()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify if Date Modified column get sorted in Descending Order",
  "keyword": "Then "
});
formatter.match({
  "location": "RetailWebsiteStepDefinition.verify_if_Date_Modified_column_get_sorted_in_Descending_Order()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
});