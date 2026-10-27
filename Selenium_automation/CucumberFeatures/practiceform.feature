Feature: Student Registration form

  Scenario: verify name,surname and email inserted successfully
    Given practice form should launch
    When enter name,surname and email
    Then name,surname and email should inserted successfully
