Feature: User Registration

  I want to check that user can register in our e-commerce website.

  Scenario: User Registeration
    Given  the user inside homePage
    And write his username and password
    And  page redirect to CreatAccount
    When  user entered his data
    Then The registeration page displayed