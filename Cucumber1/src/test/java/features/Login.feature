Feature: Application Login 


Scenario: Home page default login
Given User is on landing page 
When User login to application with username "Jin" and password "123456"
Then Home page is populated 
And Cards are displayed is "True"



Scenario: Home page default login
Given User is on landing page 
When User login to application with username "John" and password "4321"
Then Home page is populated 
And Cards are displayed is "False"