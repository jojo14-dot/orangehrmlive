Feature: Search

  Scenario: Login as admin
    Given User is on usermangmentpge
    When User enters username admin
    Then record of admin appeared
    When User clicks on searchbtn