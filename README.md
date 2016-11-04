#Java Automation Project
##Base Point for Java Automation Projects

**

**Java 7**

* Maven
* Log4j
* TestNG
* Selenium WebDriver
* Apache POI
* JDBC
* MySQL

Multi-Automation Project: Amazon, Ebay, MSN
For this project, you are to create various automation tests for Amazon.com, Ebay, and MSN. The main goal of this project will be to create follow through with 9 test cases. All of these test case scenarios should have 3 sets of data each using a data driven approach. Two case scenarios will be supplied to you for each website. The third one will be one which you should create on your own based on what you would consider an adequate test case. The main goal of this project is to get you in the mode of creating functional automation tests.
The core test structure:
Login to Amazon.com, Ebay. MSN does not require logging in. (Must sign in with a registered username and password)
Do the required test actions
Validate test scenario results for expected results, use assertions
Logout of Amazon.com, Ebay, or MSN
Test Scenarios:

Amazon:
1. User searches for a specific item, adds a set quantity to their cart
Validate that the user has added the correct number of items to their cart. 
2. User adds a of an item specific quantity to their cart.
Validate that the total cost comes out to what they would expect to have in their shopping cart.
3. (Create your own test case)
Ebay:
1. User searches for and watches a particular item. Validate that the item is in the user's account as an item being watched.
2. Navigate through the dropdown menu from the top of the Screen to a particular item (ex Power Sports). Select one of the images on the home page of those items. Add an item on the list. Validate that this item is added to your cart.
3. (Create your own test case)
MSN:
1. User select the first item on the Editors' Pick. User then clicks on the comments at the bottom. Validate that the number of comments is only between 10-50 comments.
2.  User selects at topic from the menu at the top. Validate that there are at least 6 items under a specific topic within that category.
3. (Create your own test case)

Additional Notes:
1. Allow tests to support a Data Driven Approach by providing separate data providers for each test case scenario. 
2. You may hard-code data - although it would be preferred if you got the data from an external source (text file, excel file, database), we will be covering this after the break.
3. Try to support at least 3 browsers.
4. Use a base framework to speed up time in getting started, use of helper methods is encouraged.
10. Take screenshots during the execution of your code and store these screen shots in a folder under your projects working directory.
11. Use git to version control your automation tests and try to commit on a file-by-file basis at minimum.
12. Good Luck!


[Lorne Green](https://github.com/Greenster)