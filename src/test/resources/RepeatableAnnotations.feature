Feature: Login functionality

  In order to do shopping
  As a valid user
  I want to login successfully

  Scenario: Login Successful

    Given I am in the login page of the Ivet Application2
    When I enter valid credentials2
    Then I should be taken to the Overview Page2


  Scenario: Login Successful

    Given I am in the login page2
    When I enter valid credentials2
    Then I should be taken to the Overview Page2