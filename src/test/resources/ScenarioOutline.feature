Feature: Login functionality

  In order to do shopping
  As a valid user
  I want to login successfully

  Scenario Outline: Login Successful

    Given I am in the login page of the Ivet Application3
    When I enter valid3 "<username>" and "<password>"
    Then I should be taken to the Overview Page3

    Examples:
      |username|password|
      |email1|password1|
      |email2|password2|