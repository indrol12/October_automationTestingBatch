Feature: Open cart Register |Login
  @Regression
  Scenario: verify user can create opencart account and register successfull
    Given Opencart website should be launched
    When click on register button on landing page
    And enter username,firstname,lastname
    And enter email,country,passsword
    And click on Register button
    Then User should create account and register should be successfull
  @Sanity
  Scenario: Verify after entering valid credentials user login successfull
    Given Opencart website should be launched
    When Click on login button on landing page
    And Enter Email and Password
    And Click on login button
    Then User login should be successfull
