@account
Feature: create a new different account
 Scenario Outline: For creating different Account
    Given Customer Details with account type and opening balance
    When  For valid customer with minimum opening balance <value>
    Then create new <accountType> Account
  Examples:
  |accountType|value|
  |Savings    |1000 |
  |Current    |10000|
  |RD         |100  |
  |FD         |500  |