Feature: Login
  As a user, I want to be able to login into vytrack
  under different roles with username and password

  # Any step that was implemented before, can be reused
  # If test step has yellow background, that means it doesn't have implementation yet
  # click ctr+alt+L (for MAC command+option+L)
  # I had somewhere from 2 to 25 scenarios in every feature file
  # By passing parameters/strings in "some word" we can reuse test steps
  # in my project , I was trying to keep scenarios short

  Scenario: Login as a store manager
    Given user is on the landing page
    Then user logs in as a store manager
    And user verifies that "Dashboard" page subtitle is displayed

  Scenario: Login as a driver
    Given user is on the landing page
    Then user logs in as a driver
    And user verifies that "Dashboard" page subtitle is displayed

  Scenario: Login as a sales manager
    Given user is on the landing page
    Then user logs in as a sales manager
    And user verifies that "Dashboard" page subtitle is displayed
    
  
 Scenario: Login as an Aibek
   Given user is on the landing page
   Then user logs in as an Aibek
   And user verifies that "Dashboard" page subtitle is displayed
    
