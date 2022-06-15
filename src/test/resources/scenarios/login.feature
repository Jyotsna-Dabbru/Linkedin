Feature: Login to linkedin

  Scenario: Login functionality
    Given User is in the homepage
    When User clicks on sign in button
    Then User is navigated to sign in page
    And User enters Email id
    And User enters password
    Then User clicks on Sign in


   # When Click on user profile
     # Then User information page is opened
    #Then User clicks on Contact Info
    #And verifies the email-Id

    When user clicks on search button
    And User clicks on View Full Profile of searched user
    Then User takes screenshot