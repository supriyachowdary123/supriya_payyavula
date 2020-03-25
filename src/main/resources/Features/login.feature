@SwagLabs
Feature: SwagLabs Website
  I want to use this template for my feature file

  @SwagLabs_TS1
  Scenario: Login to the website
    Given user is launching the webapplication
    When the user opens the Swaglabs Home page
    Then the user enters the username
    And the user is going to enters the password
    Then click on the login button user will navigate to the next page

  @SwagLabs_TS2
  Scenario: Login to the website with wrong username,
    Given user is launching into the webapplication,
    When the user opening Swaglabs Homepage,
    Then the user enters the wrong username ,
    And the user enters password,
    Then click on the login button user will not navigate to the next page,

  @SwagLabs_TS3
  Scenario: Logout from the website
    Given user is launching  web application
    When user opens the SwagLabs home page
    Then the user enters username and password
    And the user clicks the login button
    Then the user clicks on the menu button
    And the user clicks on logout button

  @SwagLabs_TS4
  Scenario: Filtering the page
    Given user launches the web application
    When user opens SwagLabs home page
    Then user enters username and password
    And user clicks the login button
    Then user clicks dropdown button

  @SwagLabs_TS5
  Scenario: Removing items from cart
    Given user launching the web application
    When user opening SwagLabs home page
    Then user entering username and password
    And user clicking the login button
    Then user adds item into cart and clicks on cart button
    Then user clicks on remove button
    And user clicks on continue shopping button

  @SwagLabs_TS6
  Scenario: Login to the website with wrong password
    Given user will launches to the webapplication.
    When the user is going to opens the swaglabs Homepage.
    Then the user entered the username.
    And the user enters wrong password.
    Then clicks on the login button then the user is not navigate to the next page.

  @SwagLabs_TS7
  Scenario: Adding multiple items into the cart
    Given user is going to launches the web application
    When user opens the swaglabs mainpage
    Then user will enter the username and password in the given field
    And user click on login button,
    Then the items are added in to the cart

  @SwagLabs_TS8
  Scenario: Counting Skipping the first name
    Given we need to launch the web application
    When opening the swaglabs page using the link
    Then we need to enter the username and password
    And we need to click on login button
    Then we need to click on add to cart,click on cart button and again click on click on cart checkout button
    And then click on continue
    
    @SwagLabs_TS9
  Scenario: count the images in a page
   Given we need to launch the web application in chrome browser
    When opening the swaglabs page using the url
    Then we need to enter the user name and password and login to the next page
    Then count the no of image tags in a page
    
    @SwagLabs_TS10
    Scenario: Adding to cart and removing from the cart 
     Given we need to launch the chrome browser
     When we are opening the swaglabs page
     Then We should enter the usernme and password and click on login button
     Then we should add an item to the cart and remove it 
    
  
