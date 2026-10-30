Feature: Orangehrm Website Login Functionality
  @Regression
  Scenario: verify login successfull with valid credentials
    Given Launch orangehrm website
    When enter username as "Admin" also enter password as "admin123"
    And click on login button of orangehrm website
    Then orangehrm Login should be successfull
