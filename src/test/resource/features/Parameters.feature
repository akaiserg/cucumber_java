Feature: Checking  parameters
  Scenario: Check article of Behavior-driven development  on wikipedia
    Given : I'm on wikipedia site
    When :  I look  for "Behavior-driven_development"
    Then : I check the heading which is "Behavior-driven development"
    And : I close the browser

  Scenario:  Check article of Test-driven development  on wikipedia
    Given : I'm on wikipedia site
    When :  I look  for "Test-driven_development"
    Then : I check the heading which is "Test-driven development"
    And : I close the browser