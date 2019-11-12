
Feature: Login to TestMeApp

  Scenario Outline: Login
    Given TestMeApp to be opened 
    And Navigate to SignIn page 
		And Enter "<username>" in user name
    And enter password as "<password>" 
    And Click on login
    And Login is successful
   

    Examples: 
      | username | password | 
      | Lalitha |password123 | 
     
