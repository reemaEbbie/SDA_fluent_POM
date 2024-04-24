Feature: Register New Account
  Scenario: enter a valid Credentials
    Given The page displayed
    When Enter valid Credentials and click continue button
    Then Verify the complete of the Registration
    And close browser