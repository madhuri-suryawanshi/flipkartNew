Feature: ManageAddress functionality

Background: User successfully logged In
When user open browser with "webdriver.chrome.driver" and "C:\\Users\\mahim\\Desktop\\Madhuri\\AUTOMATION TASKBAR\\SELENIUM\\chromedriver.exe"
When user enter url as "https://www.flipkart.com/"
When user click on initial login page
When user navigate on Login button
When user click on My Profile
When user enter "8149221168" as username
When user enter "madhuri123" as password
When user click on login

@SmokeTestg
Scenario: ManageAddress functionality with valid data
When user navigate on Login button
When user click on My Profile
When user enter "8149221168" as username
When user enter "madhuri123" as password
When user click on login
