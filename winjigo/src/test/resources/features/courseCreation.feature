Feature: course Creation
  As a user
  I want to create a course
  So that I can manage it

  Scenario: Create a course
    Given I am on the Winjigo website
    When I sign in with username "testregister@aaa.com" and password "Wakram_123"
    When I open the courses page
    When I click on Add course button
    When I fill course basic info
    When I save the course
    Then I should see the course title displayed
