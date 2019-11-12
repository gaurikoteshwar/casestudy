Feature: Registration on TestMeApp

  Scenario: Register on testmeapp
    Given enter the url of TestMeApp page
    And Navigate to sign up page
    And Enter user name as "gaurik18" 
    And Enter first name as "gauri" 
    And Enter Last name as "koteshwar" 
    And Enter the password as "gauri1998" 
    And confirm the password as "gauri1998" 
    And select Gender
    And Enter mail id as "gauri.koteshwar@gmail.com" 
    And Enter mobile number "9922141819"
    And Enter DOB as "18/01/1998"
    And enter address "Pratham Pardise Vadodara"
    And enter security Question
    And Enter the answer of security question as "purple"
    And Click on register
    Then Registration is successful
