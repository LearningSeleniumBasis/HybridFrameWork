#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login Feature with more data 
  I want to use this template for my feature file

  @tag1
  Scenario: Test Facebook Login with more no of data.
  
    Given  Open Chrome, start the "https://facebook.com" application.
    
    When User enters valid username "656565d6" and password "dtdttxttx" 
       
    Then User should be able to login
    

  @tag2
  Scenario Outline: Test Facebook Login with more no of data.
  
    Given Open Chrome, start the "<application>" application.
    When User enters valid username "<username>" and password "<password>"  
    Then User should be able to login

    Examples: 
      |application          |username      |password  |
      |https://facebook.com | Anitya4335353| dyddtddtr |
      |https://facebook.com | Swayam87g88  | vtuyyrdy |
      |https://facebook.com | tytyfyyyyc | dtred65d6 |