Feature: User Login with Facebook

  @Home
  Scenario: Check user login with facebook
    Given user is in Login page
    When user clicks continue with facebook button
    Then Facebook login window appears
