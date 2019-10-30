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
Feature: Share to Whatsapp
	   User should be able to share pitures to whatsapp directly
Scenario:  Shared Successfully
	   The image should be shown on the recipient's whatsapp	
Given The user has shared it from instagram	
When  The user shares on the share to whatsapp option 	 	
And  If the account is private the recipient should get a link to follow the account 
	
Then  the user should be able to see
