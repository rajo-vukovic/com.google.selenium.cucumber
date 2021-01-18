Feature: Google Search Page

  Scenario: Logo presence on Google Search Page
    Given I launch Chrome browser
    When I open Google Search Page
    Then I verify that the logo is presence on Search Page
    And Close Chrome browser