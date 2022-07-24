Feature: Login functionality

Background: Application opens successfully
When user open browser with "webdriver.chrome.driver" and "C:\\Users\\mahim\\Desktop\\Madhuri\\AUTOMATION TASKBAR\\SELENIUM\\chromedriver.exe"
When user enter url as "https://www.flipkart.com/"


@SmokeTest
Scenario: Login functionality with valid credentials
When user click on initial login page
When user navigate on Login button
When user click on My Profile
When user enter "8149221168" as username
When user enter "madhuri123" as password
When user click on login
Then application shows login suucessfully
