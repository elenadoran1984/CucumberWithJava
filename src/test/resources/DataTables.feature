Feature: Login functionality

  In order to do shopping
  As a valid user
  I want to login successfully

  Scenario: Login Successful

    Given I am in the login page of the Ivet Application4
    When I enter valid credentials4
      |email1|password1|
    Then I should be taken to the Overview Page4