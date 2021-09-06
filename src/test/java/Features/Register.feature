Feature: Create Account , Product Selection, Checkout
  @registerAndCheckOut
  Scenario: User registers by successfully completing the registration form and the payment process is completed by selecting the product.
    Given a web browser is at the automationpractice home page
    When the user click sign in button
    Then user sees the AUTHENTICATION page
    And User enters account creation email address
    And click on create account button
    Then user sees the create an account page
    And user sees the personal information
    And user clicks title
    And user enters the First Name
    And user enter the Last name
    And user enters the First Name
    And user enters the Password
    Then user sees the your adress
    And user enters the First Name to adress
    And user enters the Last Name to adress
    And user enters the Address
    And user enters the City
    And user selects the State
    And user enters the Zip/Post Code
    And user selects the Country
    And user enters the Mobile Phone
    And user enters the City Assign an address alias for future reference.
    And user click register button
    Then user sees the My account page
    And  user returns to homepage
    Given User sees dresses category on home page
    When user clicks on dresses category and opens dropdown
    And  User clicks on the subcategory summer dresses
    And  user selects a product
    And  user adds product to cart
    And  user clicks continue shopping button
    Then user clicks search
    And  The user types the word they want to search.
    And  user clicks the search button
    And  user selects a productTwo
    And  user adds productTwo to cart
    And  user clicks proceed to checkout button
    Given a web browser is at the cart page
    When user checks for added products
    And user checks the name of their added product
    And user checks the number of products added
    And user checks the price of their added products
    And user clicks proceed the checkout button
    Then user sees address page
    And user clicks proceed the checkout buttonn
    And user Choose a shipping option
    And user clicks terms of service checkbox
    And user clicks proceed the checkout buttonTwo
    And user choose any payment method
    And user clicks ı confirm my order button
    And user clicks on my user account
    Given a web browser is at the my account page
    Then user clicks Order history and details button
    And user check order referance
