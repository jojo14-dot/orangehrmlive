Feature: save

  Scenario: press on admin
    Given User press add btn
    When User select userrole and status
    And User fills employee name , user name, password and confirm pasword
    Then  sucessmsg appears
    When User clicks on save