Feature: Delete Lead

@regression @sanity
Scenario Outline: Delete a Lead with mandatory field

Given enter the username as <userName>

And enter the password as <password>


And click login 


And click crm/sfa

And click lead

And click find Lead

And enter lead id as <leadID>

When click find lead

And select first leadid

Then click delete 



Examples:

|userName|password|leadID|
|DemoSalesManager|crmsfa|10998|

@sanity
Scenario Outline: Create a Lead with mandatory field

Given enter the username as <userName>

And enter the password as <password>

And click login 

And click crm/sfa

And click lead

And click create Lead

And enter company name as <companyName>

And enter first name as <firstName>

And enter last name as <lastName>

When click create lead

Examples:

|userName|password|companyName|firstName|lastName|
|DemoCSR|crmsfa|tcs|ganesh|ts|





