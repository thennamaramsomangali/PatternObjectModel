Feature: Create Lead

Background:

Given open the browser

And max the browser,set the timeout

And enter the URL

And enter the username as DemoSalesManager

And enter the password as crmsfa

And click login 

And click crm/sfa

And click lead


Scenario: Create a Lead with mandatory field



And click create Lead

And enter company name as tcs

And enter first name as ganesh

And enter last name as ts

When click create lead


Scenario: Create a Lead with mandatory field



And click create Lead

And enter company name as tcs

And enter first name as ganesh

And enter last name as ts

When click create lead




