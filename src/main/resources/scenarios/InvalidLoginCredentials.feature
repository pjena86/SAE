Feature: Invalid login credential
  Scenario Outline: Invalid login credential

    Given user launches the website <url>
    When user enters valid <username> and <password>
    Then user will be able to login

    Examples:
      |url|username|password|
      |   |        |        |