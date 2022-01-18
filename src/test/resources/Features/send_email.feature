Feature: Compose a mail through gmail account

  Scenario Outline: User logs in and send email
  	
    Given User is on <gmail> page
    And User nevigates to gmail sign in page
    When User enters <username> and <password>
    Then User clicks on the compose button
    Then  user enters the <body>
    Then user sends an email to <email> with <subject>

    
    
Scenario Outline: User fills out the Personal Info Form With Valid Data
And I enter a first name as "<first_name>"
And I enter a middle name as "<middle_name>"
And I enter a last name as "<last_name>"



Examples:

|username | password | body | email | subject |
