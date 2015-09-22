Feature: As a Qbo user,I want to create my own recipe

  @test	
  Scenario: As a Qbo user,I want to create my own recipe
    Given I open the app and land on home screen
    When I touch on create new recipe button
    Then I should be taken to customize recipe page
    
