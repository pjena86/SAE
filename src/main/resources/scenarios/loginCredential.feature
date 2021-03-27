Feature: Login credential
  Scenario Outline: Valid Login credential

#  Parameterize
    Given user launches the website <url>
    When user enters valid <username> and <password>
    Then verify that user will be able to login

    Examples:
    |url|username|password|
    |   |        |        |


