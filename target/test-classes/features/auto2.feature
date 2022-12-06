@auto2
Feature:Auto Quote Validation

Scenario:Auto quote test
Given user navigate to aboutPages
When user click forgot password
And user input userId2
When click continue
And continue overlay handle
Then user  will be in informationPage
And title of the page will be <informationPage>
