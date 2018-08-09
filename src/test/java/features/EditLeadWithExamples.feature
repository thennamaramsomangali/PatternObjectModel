Feature: Edit Lead

@smoke
Scenario Outline: Edit a Lead with mandatory field

Given enter the username as <userName>

And enter the password as <password>

And click login 

And click crm/sfa

And click lead

And click find Lead

And enter lead id as <leadID>

When click find lead

And select first leadid

Then click edit 

And edit first name as <editfirstName>

Then  click update 


Examples:

|userName|password|leadID|editfirstName|
|DemoCSR|crmsfa|11034|cts|





