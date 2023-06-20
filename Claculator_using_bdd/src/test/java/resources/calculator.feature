Feature: Calculator
  As a user
  I want to perform basic calculations
  So that I can get accurate results

  Scenario: Add two numbers
    Given I have a calculator
    When I add 5 and 7
    Then the result should be 12

  Scenario: Subtract two numbers
    Given I have a calculator
    When I subtract 10 from 20
    Then the result should be 10

  Scenario: Multiply two numbers
    Given I have a calculator
    When I multiply 3 by 4
    Then the result should be 12

  Scenario: Divide two numbers
    Given I have a calculator
    When I divide 20 by 5
    Then the result should be 4
