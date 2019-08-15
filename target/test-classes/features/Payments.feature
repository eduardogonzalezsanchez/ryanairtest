Feature: Automate a booking up to a declined payment 

Background: User is in homePage and set language 

	Given User is in homePage 
	And change language	to English 
	And i login 
	
Scenario: 1.Prueba 
	Given i make a booking from "DUB" to "SXF" on "22/10/2019" for "2" adults and "1" child 
	And tap on Website terms and on Let´s go 
	When i tap on first choice fly, plus option and tap on Continue Btn 
	Then seats selection is loaded 
	And tap on 'Ok, Got it' Btn 
	And select seats and confirm 
	When i tap on 'Check out' Btn 
	Then 'payment page' is launched 
	When I send passengers1 data "Eduardo" and "Gonzalez"
	And I send passengers2 data "Patricio" and "Gonzalez"
	And I send passengers3 data "Rodolfo" and "Langostino"
	And I add insurance
	And I send telephone "666666666"
	And I pay for booking with card details "5555555555555557" , "10/2019" , "265" and "Eduardo Gonzalez"
	And I send billing address "Street La Esquina", "Madrid" , "23456" , "Spain" and tap on PayNow Btn
	Then card error message appears