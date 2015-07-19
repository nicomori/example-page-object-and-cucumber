Feature: Testing example with cucumber Version: 0.0.1

Scenario Outline: Search something in google and check if the result it's ok.

Given I open in "<browser>" and set the emulation to device "<device>" 
And I access to this "<url>"
When I type "<string to search>" in the search field
And I click the search button
Then I need check "<to verify>"

Examples:
| url	 						| browser 	| string to search			| device					| to verify		|
| https://www.google.com.ar/ 	| firefox  	| samsung note 4			| 							| title			|
| https://www.google.com.ar/ 	| firefox  	| samsung note 4			| 							| url			|
| https://www.google.com.ar/ 	| firefox  	| samsung note 4			| 							| description	|
