Feature: Login feature

  Background: 
    Given user is on login page
    
 @Login
  Scenario Outline: 
    When user enters email"<email>"
    And enters password"<password>"
    And hits login button
    Then his is navigated to account page

    Examples: 
      | email             | password  |
      | test9912@test.com | 123456Ab- |
      | test7843@test.com | 123456aB- |
