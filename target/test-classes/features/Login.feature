Feature: Login

  Scenario: Login as admin
    Given User is on Login Page
    When User enters username and password
    And User clicks on login button
    Then Admin page is displayed
    When User clicks on Admin tab
    