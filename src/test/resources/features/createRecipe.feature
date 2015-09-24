Feature: As a Qbo user,I want to create my own recipe

  @test	
  Scenario: As a Qbo user,I want to create my own recipe
    Given I open the app and land on home screen
    Then create recipe tab should be open by default
    When I touch on create new recipe button
    Then I should see the ten default recipes
	    | Ristretto       | A smaller shot of espresso coffee, for a fast dose of caffeine. |
	    | Espresso        | A strong coffee shot of about 40 ml, to energize you after a fine meal. |
	    | Espresso Macchiato | An Espresso with a milky touch. |
	    | Caffè           | A black coffee with indulgent crema to easily wake you up in the morning. |
	    | Cappuccino      | Prepared with espresso, hot milk, and milk foam, for your joyful Italian style coffee moments. |
	    | Caffè Latte     | Same amount of milk as the Café au lait, but brewed with an Espresso, this is the one for hot milk lovers. |
	    | Café au Lait    | This traditional drink has caffè and hot milk in equal parts, for mug size coffee for milk lovers. |
	    | Latte Macchiato | With even more delicious milk and foam added then in a Cappuccino, it will boost your innovative moments. |
	    | Iced Cappuccino | Cappuccino poured over ice cubes and brewed with cold milk and froth, to enjoy in hot moments. |
	    | Iced Caffè Latte | Caffè Latte poured over ice cubes and brewed with cold milk, makes a perfect summer drink. |
	    | Iced Latte Macchiato | Latte Macchiato poured over ice cubes and brewed with cold milk and froth, to always keep a cool head. |
	    
    
