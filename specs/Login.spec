Login Specification
===================
Date Created    : 09/16/2017
Version   		: 1.0.0
Owner      		: Osanda Deshan
Description  	: This is an executable specification file which follows markdown syntax. Every heading in this file denotes a scenario. Every bulleted point denotes a step.


tags: login



Targeted platform information
-----------------------------
* Testing platform information



Verify that the Login page contains the Create Account button
-------------------------------------------------------------
* Verify that the Create Account button is visible



Verify that an invalid user cannot login to the application
-----------------------------------------------------------
* Verify that the Login page title is "Login"
* Verify that a user can login into the application using valid username and password
     |Username       |Password       |
     |---------------|---------------|
     |Osanda         |Password       |
* Verify that the login is fail



Clear username and password textbox contents
--------------------------------------------
* Clear text fields in Login page



Verify that a valid user can login to the application
-----------------------------------------------------
* Verify that a user can login into the application using valid username and password
     |Username       |Password       |
     |---------------|---------------|
     |osanda12       |Password1      |
* Skip the welcome flow
* Tap 'Got It' button
* Verify that the login is success



Verify that a user lands to the Expert Decks page after the login
-----------------------------------------------------------------
* Verify that the user lands to the "Expert Decks" page