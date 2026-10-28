
Feature: Toolshop register

Background:
 Given practice software testing should be launch

 Scenario: Verify Customer registration should be successfull   
    When user navigate to register page,enter firstname ,lastname
    And enter date of birth,enter country
    And click on register
    Then Customer register should be successfull

Scenario: Verify Customer Login should be successfull
    When  user navigate to login page,enter Email ,Password
    And click on login button
    Then Customer login should be successfull
  