Feature: Math Utilities
  Does multiplication work?
		
  Scenario: Simple multiplication
    Given the multiplicands are 2 and 3
    Then the result is 6
    Then the result is not 0
		
  Scenario: Simple multiplication
    Given the multiplicands are 3 and 2
    Then the result is 6
    Then the result is not 0
