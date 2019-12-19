@smoke_test
Feature: Smoke test

  Background: open login page and login as store manager
    Given user is on the login page
    Then user logs in as sales manager


  Scenario: Verify dashboard page
    And user verifies that "Dashboard" message is displayed

  Scenario: Verify Manage Dashboards page
    When user navigates to "Dashboards" and "Manage Dashboards"
    And user verifies that "All Manage Dashboards" message is displayed





