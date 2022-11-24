Feature: Navigate to Men's Fashion functionality

  Background:
    Given Navigate to AliExpress

  Scenario: price list of parkas
    Given go to men's fashion from the hamburger icon on the left
    And go Men's Fashion act
    And click parkas

    When find the most expensive products
    |min|20000|
    |max|25000|

    And search
    |Ok|

   Then verify no product