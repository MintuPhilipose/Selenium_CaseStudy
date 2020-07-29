$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Register.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# Registeration Validation"
    }
  ],
  "line": 3,
  "name": "to validate registration",
  "description": "",
  "id": "to-validate-registration",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "duration": 12726105300,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "the browser is launched",
  "keyword": "Given "
});
formatter.match({
  "location": "Registration.the_browser_is_launched()"
});
formatter.result({
  "duration": 320647100,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "to validate registration step and confirm acknowledgement msg",
  "description": "",
  "id": "to-validate-registration;to-validate-registration-step-and-confirm-acknowledgement-msg",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "the user clicks the signup",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "take the user to \"signup\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "the user enters the mandatory details",
  "rows": [
    {
      "cells": [
        "Firstname",
        "LastName",
        "Email",
        "Username",
        "Pass",
        "Confirm_Password"
      ],
      "line": 12
    },
    {
      "cells": [
        "NM63",
        "LM63",
        "EM63@GMAIL.COM",
        "U63",
        "PASS63",
        "PASS63"
      ],
      "line": 13
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "click on the register button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "take the user to \"signup\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "confirm the acknowledgement message",
  "keyword": "And "
});
formatter.match({
  "location": "Registration.the_user_clicks_the_signup()"
});
formatter.result({
  "duration": 2509178800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "signup",
      "offset": 18
    }
  ],
  "location": "Registration.take_the_user_to_page(String)"
});
formatter.result({
  "duration": 28825300,
  "status": "passed"
});
formatter.match({
  "location": "Registration.the_user_enters_the_mandatory_details(DataTable)"
});
formatter.result({
  "duration": 1417174300,
  "status": "passed"
});
formatter.match({
  "location": "Registration.click_on_the_register_button()"
});
formatter.result({
  "duration": 2513240800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "signup",
      "offset": 18
    }
  ],
  "location": "Registration.take_the_user_to_page(String)"
});
formatter.result({
  "duration": 6619100,
  "status": "passed"
});
formatter.match({
  "location": "Registration.confirm_the_acknowledgement_message()"
});
formatter.result({
  "duration": 83343300,
  "status": "passed"
});
formatter.after({
  "duration": 957172200,
  "status": "passed"
});
formatter.before({
  "duration": 10698017800,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "the browser is launched",
  "keyword": "Given "
});
formatter.match({
  "location": "Registration.the_browser_is_launched()"
});
formatter.result({
  "duration": 30232300,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "to validate Profile Details Matches with Registered User",
  "description": "",
  "id": "to-validate-registration;to-validate-profile-details-matches-with-registered-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "the user clicks the signup",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "take the user to \"signup\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "the user enters the mandatory details",
  "rows": [
    {
      "cells": [
        "Firstname",
        "LastName",
        "Email",
        "Username",
        "Pass",
        "Confirm_Password"
      ],
      "line": 22
    },
    {
      "cells": [
        "NM64",
        "LM64",
        "EM64@GMAIL.COM",
        "U64",
        "PASS64",
        "PASS64"
      ],
      "line": 23
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "click on the register button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "take the user to \"signup\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "click the profile icon",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "Validate the firstname, lastname and email",
  "keyword": "And "
});
formatter.match({
  "location": "Registration.the_user_clicks_the_signup()"
});
formatter.result({
  "duration": 2513030100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "signup",
      "offset": 18
    }
  ],
  "location": "Registration.take_the_user_to_page(String)"
});
formatter.result({
  "duration": 16055100,
  "status": "passed"
});
formatter.match({
  "location": "Registration.the_user_enters_the_mandatory_details(DataTable)"
});
formatter.result({
  "duration": 1119921000,
  "status": "passed"
});
formatter.match({
  "location": "Registration.click_on_the_register_button()"
});
formatter.result({
  "duration": 2271544700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "signup",
      "offset": 18
    }
  ],
  "location": "Registration.take_the_user_to_page(String)"
});
formatter.result({
  "duration": 5838300,
  "status": "passed"
});
formatter.match({
  "location": "Registration.click_the_profile_icon()"
});
formatter.result({
  "duration": 171182400,
  "status": "passed"
});
formatter.match({
  "location": "Registration.validate_the_firstname_lastname_and_email()"
});
formatter.result({
  "duration": 116771500,
  "status": "passed"
});
formatter.after({
  "duration": 965665600,
  "status": "passed"
});
formatter.before({
  "duration": 10884066700,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "the browser is launched",
  "keyword": "Given "
});
formatter.match({
  "location": "Registration.the_browser_is_launched()"
});
formatter.result({
  "duration": 43048200,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "to validate Mailer Function using DB after signup",
  "description": "",
  "id": "to-validate-registration;to-validate-mailer-function-using-db-after-signup",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 30,
  "name": "the user clicks the signup",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "take the user to \"signup\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "the user enters the mandatory details and store in DB",
  "rows": [
    {
      "cells": [
        "Firstname",
        "LastName",
        "Email",
        "Username",
        "Pass",
        "Confirm_Password"
      ],
      "line": 33
    },
    {
      "cells": [
        "SAMUEL",
        "LM65",
        "EM65@GMAIL.COM",
        "U65",
        "PASS65",
        "PASS65"
      ],
      "line": 34
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "click on the register button",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "take the user to \"signup\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "click the profile icon",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "clicks the Inbox link",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "take the user to \"Inbox\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "clicks compose button",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "the user is taken to compose mail template",
  "keyword": "Then "
});
formatter.match({
  "location": "Registration.the_user_clicks_the_signup()"
});
formatter.result({
  "duration": 2749919400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "signup",
      "offset": 18
    }
  ],
  "location": "Registration.take_the_user_to_page(String)"
});
formatter.result({
  "duration": 14307900,
  "status": "passed"
});
formatter.match({
  "location": "Registration.the_user_enters_the_mandatory_details_storedb(DataTable)"
});
formatter.result({
  "duration": 1834509100,
  "status": "passed"
});
formatter.match({
  "location": "Registration.click_on_the_register_button()"
});
formatter.result({
  "duration": 1759243800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "signup",
      "offset": 18
    }
  ],
  "location": "Registration.take_the_user_to_page(String)"
});
formatter.result({
  "duration": 12722500,
  "status": "passed"
});
formatter.match({
  "location": "Registration.click_the_profile_icon()"
});
formatter.result({
  "duration": 179374400,
  "status": "passed"
});
formatter.match({
  "location": "Registration.clicks_the_Inbox_link()"
});
formatter.result({
  "duration": 2576612100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Inbox",
      "offset": 18
    }
  ],
  "location": "Registration.take_the_user_to_page(String)"
});
formatter.result({
  "duration": 54200,
  "status": "passed"
});
formatter.match({
  "location": "Registration.clicks_compose_button()"
});
formatter.result({
  "duration": 2196768400,
  "status": "passed"
});
formatter.match({
  "location": "Registration.the_user_is_taken_to_compose_mail_template()"
});
formatter.result({
  "duration": 35883235900,
  "status": "passed"
});
formatter.after({
  "duration": 986173600,
  "status": "passed"
});
});