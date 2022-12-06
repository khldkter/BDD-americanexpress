@regression
Feature: Auto Quote Validation

Scenario: Auto quote test
Given user navigate to homePage
When user input userId
And user input password
And click cardsandBanking
And click iAgreeCheckBox
And click login
And click forgot password
Then user  will be in about pages
And title of the page will be <AboutPages>

@smoke
Scenario: Auto quote test 2
Given user navigate to homePage
When user input userId
And user input password
And click cardsandBanking
And click iAgreeCheckBox
And click login
And click forgot password
Then user  will be in about pages
And title of the page will be <AboutPages>
