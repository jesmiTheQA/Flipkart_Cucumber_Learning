
Feature:I want to use this template for handling an items in cart


  Scenario: ToLogin to Flipkart and add an item to cart
    Given I want to Login to Flipkart
    When I want to add item to my cart
    Then I validate the item in the cart


Scenario: Verify whther item removed from cart
		Given I have open the browser
		When Removed item from cart
		Then Login button should exits
		
		
Scenario: Verify the Pay on Delivery option
		Given Open flipcart
		When Select an item
		And  Add that item to cart
		And  Place it for order
		And  Select delivery address
		Then The selected payment method is Pay on Delivery
		And Close browser in this secnario	
		
Scenario: Verify the price of an item
    Given Login to flipkart
    When Search for an item
    Then Check the price
    And Close browser		
		
		






