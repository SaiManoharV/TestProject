@Sai
Feature: Testing Swaglabs application

  @Scenario1
  Scenario: Checkout and validate the product
    Given Launches application and Login
    And Add the product to the cart
    And Remove the products from cart
    

  @Scenario2
  Scenario: Validate the product details
    Given Launches application and Login using valid credentials
    And check each item as correct title
    And check each item as correct description
    And check each item as correct price
    
  @Scenario3
  Scenario: Invalid Username and password
    Given Launches application and enters invalid user credentials
    And Launches application and try to login without providing values
    
   