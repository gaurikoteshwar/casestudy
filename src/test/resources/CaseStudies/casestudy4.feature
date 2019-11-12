
Feature: Shopping headphones

  Scenario Outline: Online shopping
    Given TestMeApp should be opened
    And Move to SignIn 
		And  "<username>" in username
    And  "<password>" in password
    And Now Click on login button
    And Login is validated
    Then now  Click on All categories
    Then now Click on Electronics
    Then now Click on Headphones
    Then check cart on page
    
    
    
    Examples: 
      | username | password | product|
      | Lalitha |password123 | head|