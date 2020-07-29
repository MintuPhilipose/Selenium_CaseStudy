# Registeration Validation
@sanity
Feature: to validate registration

  Background: 
    Given the browser is launched

  Scenario: to validate registration step and confirm acknowledgement msg
    When the user clicks the signup
    Then take the user to "signup" page
    Then the user enters the mandatory details
      | Firstname | LastName | Email          | Username | Pass   | Confirm_Password |
      | NM63      | LM63     | EM63@GMAIL.COM | U63      | PASS63 | PASS63           |
    And click on the register button
    Then take the user to "signup" page
    And confirm the acknowledgement message

  Scenario: to validate Profile Details Matches with Registered User
    When the user clicks the signup
    Then take the user to "signup" page
    Then the user enters the mandatory details
      | Firstname | LastName | Email          | Username | Pass   | Confirm_Password |
      | NM64      | LM64     | EM64@GMAIL.COM | U64      | PASS64 | PASS64           |
    And click on the register button
    Then take the user to "signup" page
    Then click the profile icon
    And Validate the firstname, lastname and email

  Scenario: to validate Mailer Function using DB after signup
    When the user clicks the signup
    Then take the user to "signup" page
    Then the user enters the mandatory details and store in DB
      | Firstname | LastName | Email          | Username | Pass   | Confirm_Password |
      | SAMUEL    | LM65     | EM65@GMAIL.COM | U65      | PASS65 | PASS65           |
    And click on the register button
    Then take the user to "signup" page
    Then click the profile icon
    And clicks the Inbox link
    Then take the user to "Inbox" page
    And clicks compose button
    Then the user is taken to compose mail template
