Feature: Math Utilities
  Does addition work?
		
  Scenario: Simple addition
    Given addends are 2 and 3
    Then the result is 5
    Then the result is not 0
		
  Scenario: Simple addition
    Given addends are 3 and 2
    Then the result is 5
    Then the result is not 0
