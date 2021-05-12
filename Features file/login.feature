Feature: OctaCart Application

Scenario: Login test

Given user should be on login page
When user enters email and password and click login button
Then user will be on home page

Scenario: verify logo

Given user should be on login page 
Then user should see OctaCart logo

