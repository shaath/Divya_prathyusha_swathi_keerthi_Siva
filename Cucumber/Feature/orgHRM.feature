Feature: OrangeHRM Login and Logout

	Scenario: Login Test
	 Given Browser Should launch navigate to url
	 When Tester Enters username and password
	 And Clicks on login
	 Then Welcome Admin Message displayed
	 
	Scenario: Logout
	 When Tester clicks on welcome admin link
	 And also clicks on logout
	 Then Login page displayed
	 
	