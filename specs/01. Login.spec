Login Specification
===================
Date Created    : 09/16/2017
Version   		: 1.0.0
Owner      		: Osanda Deshan
Description  	: This is an executable specification file which follows markdown syntax. Every heading in this file denotes a scenario. Every bulleted point denotes a step.


tags: login



Mobile device configurations
----------------------------
* Get device configurations



Verify that the Login page contains the Create Account button
-------------------------------------------------------------
* Create Account button should be visible



Verify that an invalid user cannot login to the application
-----------------------------------------------------------
* Login page title is "Login"
* Set the username and the password
     |Username       |Password       |
     |---------------|---------------|
     |Osanda         |Password       |
* Tap on Sign in button
* Login error alert title is "Authentication Failed"
* Login error alert message is "invalid username or password"
* Tap on Ok button in the login error alert



Clear username and password textbox contents
--------------------------------------------
* Clear text fields in Login page



Verify that a valid user can login to the application
-----------------------------------------------------
* Set the username and the password
     |Username       |Password       |
     |---------------|---------------|
     |osandadeshan   |Password1      |
* Tap on Sign in button
* Tap on Skip button
* Tap on Got It button
* User lands to the "Expert Decks" page



Verify that a user lands to the Expert Decks page after the login
-----------------------------------------------------------------
* User lands to the "Expert Decks" page