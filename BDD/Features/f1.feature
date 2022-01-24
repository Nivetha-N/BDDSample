Feature: Automate the iTime application

  Scenario: Automate the login page and mark time entry
    Given Open chrome browser and enter iTime url
    When Enter username,password to log in and search for itime
    Then Time entries successfully marked

	