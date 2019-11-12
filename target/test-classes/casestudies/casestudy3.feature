
Feature: Shopping headphones

  Scenario Outline: Online shopping
    Given TestMeApp to be opened in browser
    And Navigate to SignIn 
		And Enter "<username>" in username
    And enter "<password>" in password
    And Click  login button
    And Login validated
    Then Click on All categories
    Then Click on Electronics
    Then Click on Headphones
    Then type "<product>" in search tab and click on search
    Then Click on Add to Cart
    Then Click on Cart
    Then Click on checkout
    Then enter shipping address
    Then Click on procced to pay
    

    Examples: 
      | username | password | product|
      | Lalitha |password123 | head|