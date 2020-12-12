Feature: Math Utilities
  Does exponentiation work?
		
  Scenario: Simple exponentiation
    Given the base is 2 and the exponent is 3
    Then the result is 8
    Then the result is not 9
		
  Scenario: Simple exponentiation
    Given the base is 3 and the exponent is 2
    Then the result is 9
    Then the result is not 8
