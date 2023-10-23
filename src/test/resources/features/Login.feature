@FirstRelease
Feature: Login functionality

  @Positive
  Scenario Outline: Ensure user succesfully login

    Given user is on SauceDemo homepage
    When user input <username> as username
    And user input <password> as password
    And user click enter
    Then user verify <status> login result

    Examples:
      | username                | password      | status    |
      | standard_user           | secret_sauce  | success   |
      | performance_glitch_user | secret_sauce  | success   |
      | locked_out_user         | secret_sauce  | false     |
      | iamNOTaUSER             | secret_sauce  | false     |

  @Negative
  Scenario Outline: Ensure user failed login with username and wrong password
    Given user is on SauceDemo homepage
    When user input <username> as username
    And user input <password> as password
    And user click enter
    Then user verify failed login

    Examples:
      | username                | password      |
      | standard_user           | secretsauce  |

  @Negative
  Scenario Outline: Ensure user failed login with password null
    Given user is on SauceDemo homepage
    When user input <username> as username
    And user click enter
    Then user verify failed login

  Examples:
    | username                |
    | standard_user           |
