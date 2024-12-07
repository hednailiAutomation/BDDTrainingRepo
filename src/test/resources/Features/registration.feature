Feature: Registration feature

  Background: 
    Given user is on registration page

  Scenario Outline: Test Registration Fonctionality
    When user enters firstname "<firstname>"
    And enters lastname "<lastname>"
    And user enters email "<email>"
    And enters password "<password>"
    And enters confirm password "<confirmPassword>"
    And hits submit
    Then a confirm registration message is displayed

    Examples: 
      | firstname | lastname | email             | password  | confirmPassword |
      | Mohamed   | Ali      | test9912@test.com | 123456Ab- | 123456Ab-       |
      | Sami      | Nejib    | test7843@test.com | 123456aB- | 123456aB-       |
