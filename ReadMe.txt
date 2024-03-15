*****************************************************PROJECT DESCRIPTION*****************************************************************

Problem Statement : Identify Courses

Search and display all web development courses 
1. Should be for beginners level.
2. Courses offered in English language
3. Display first two courses with name, total learning hours and rating.
(Suggested Site: coursera.org however  you are free to choose any other legitimate  site)


  
Detailed Description: 

1. Open the Coursera Home Page(Url-->"https://www.coursera.org/").
2. Search for "Web Development Courses" in the SearchBox.
3. Select the English Language checkbox in Language and Beginner level checkbox in Levels.
4. After the Filter Click the First Course and get the Details Of the Course(Title,Rating,Duration).
5. Then click the Second course and get the details of the Course(Title,Rating,Duration).
6. Now clear the searchbox and Search for "Language Learning" and click searchButton.
7. Click Showmore in Language checkbox and Extract all the languages with total count.
8. And different levels with its total count & display them.
9. Then return to Home Page and scroll bottom to click ForEnterprise.
10. Now click WhatWeOffer and click the Learn-More option.
11. Now enter value for FirstName, LastName, Email, Phone No, Institute Type, Institite Name, Job Role, Department, Describe, Learner, Country, State.
12. Then click Submit and verify the Email error Message 


Key Automation Scope

Handling different browser windows, search option
Extract multiple drop down list items & store in collections
Navigating back to home page
Filling form (in different objects in web page)
Capture warning message
Scrolling down in web page


**********************************************************STEPS TO EXECUTE*************************************************************

-> unzip the folder
-> On eclipse, goto file-> import-> select maven-> click on existing maven project->next-> browse the location where u unzip the folder-> click on finish
-> Now go to the MastertestNG.xml file and run as TestNGSuite.
-> Now the file will Execute and we get the expected output as shown below.
-> Now go to TestRunner.java file and run as JUnit test.
-> Now the file will Execute in Cucumber and we get the expected output as shown below.


*******************************************************FILES DESCRIPTION**************************************************************

1. src/test/java - There are 7 packages present in this folder.
 
-> factory : In this package we have CucumberBaseClass.java file in which we invoke the browser initialization, we also added logger and properties method to include logs and access config.properties file. 

-> pageObject : Page Object containing different class contains which are BasePage.java, CourseraHomePage.java, WebDevelopPage.java, LanguageLearningPage.java, ForEnterprisePage.java .
 
-> stepDefinition : This package contains WebDevelopStep.java, LangLearningStep.java, ForEnterpriseStep.java which contains the testSteps to execute the project in Cucumber and Hooks.java contains the driver setup , screenshots and Closing the browser.

-> test_base:In this package we have BaseClass.java is our main project file in which we Firstly invoke the selected browser and generate the report file in html format and store it in report opening Coursera website [Cousera](https://www.coursera.org/) and closing the browser
 
-> test_cases:In this package we have TC_001_WebDevelopmentTest.java, TC_002_LanguageLearningTest.java, TC_003_ForEnterpriseTest.java class which extends BaseClass.java where the methods are present which will login to the page and verify and validate all the testCases.
 
-> TestRunner : In this package we have TestRunner.java file where we include feature file path and cucumber plugins to generate cucumber report.

-> utilities: In the utilities package all the read, write work and extent report work is done.

 
 
2. src/test/resources- In this folder, there are three files

->  config.properties  : This file is used to store the reusable values such as apprl,browser name and os name.

->  extent.properties  : This file is used to generate the extentReport for the execution in cucumber framework.

->  log4j2.xml  : This file is used to generate log informations about the execution of test cases.



3. JRE System Library: In this File we have all dependencies of JAR.files. 
        
4. Maven Dependencies: In this File we have all the directory on the local machine, where all the project artifacts are stored. When a Maven build is executed, Maven automatically downloads all the dependency jars into the local repository. Usually, this directory is named.

5. Features : In this folder we have all the feature files with .feature extension which needs to be invoked while excuting the project in cucumber framework.

6. Logs : In this folder logs are present which is generated while executing the project.

7. Report: In this folder the Test-Report-YYYY.MM.DD.html and CucumberReport.html are present. 

8. ScreenShot : There are 24 images. As I Implemented the Screenshot code in ExtentReport now it will get screenshot for every TestSuccess, TestFailure and TestSkipped.
 
9. src: In this, there are two folders
	-main:It is an empty folder
	-test:It is an empty folder

10. target: It is an empty folder
 
11. TestData : In this folder we have two files,

	-Read  : In this excel file all the data which need to be passed to required WebElements are stored.

	-Write  : After the execution of project the result will be stored.

12. Test-Output : This folder is used to store the Cucumber SparkReport.

13. CrossBrowsertestNG.xml : In this file test classes are defined for cross browser execution.
 
14. MasterTestNG.xml : In this file test classes are defined for executing the project in only one browser

15. pom.xml: The pom.xml file contains information of project and configuration information for the maven to build the project such as dependencies,build directory, source directory, test source directory, plugin, goals etc. Maven reads the pom.xml file, then executes the goal.
 
16. run.bat : This file is included to run the project in command prompt


 
***************************************************************************************************************************************

                                                        OUTPUT ON CONSOLE WHILE RUNNING TESTNG

***************************************************************************************************************************************

The Course Details Are:
First Course Name: Meta Front-End Developer
Rating Of First Course: 4.7
Duration Of First Course: 7 months at 6 hours a week
Second Course Name: Introduction to Web Development
Rating Of Second Course: 4.7
Duration Of Second Course: Approx. 21 hours to complete

The Languages are:
Spanish (1,099)
Arabic (1,010)
French (995)
Chinese (China) (988)
Portuguese (Brazil) (986)
German (975)
Indonesian (974)
Hindi (970)
Italian (969)
Swedish (968)
Dutch (967)
Greek (967)
Polish (967)
Thai (967)
Turkish (967)
Ukrainian (967)
Russian (944)
Kazakh (893)
Hungarian (696)
Japanese (89)
Korean (87)
Chinese (Traditional) (5)
Hebrew (2)

The Total No of Languages:23

The Levels are:
Beginner (736)
Intermediate (689)
Advanced (67)
Mixed (125)

The Total No of Levels:4

The Status Of Email Address is: 
Please enter your work email address


===============================================
Suite
Total tests run: 24, Passes: 24, Failures: 0, Skips: 0
===============================================



***************************************************************************************************************************************

                                                        OUTPUT ON CONSOLE WHILE RUNNING CUCUMBER

***************************************************************************************************************************************

@sanity @regression
Scenario: Web Development Test                               # Features/1WebDevelopTest.feature:4
Feb 29, 2024 11:29:44 AM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
WARNING: Unable to find CDP implementation matching 118
Feb 29, 2024 11:29:44 AM org.openqa.selenium.chromium.ChromiumDriver lambda$new$5
WARNING: Unable to find version of CDP to use for 118.0.5993.71. You may need to include a dependency on a specific version of the CDP using something similar to `org.seleniumhq.selenium:selenium-devtools-v86:4.17.0` where the version ("v86") matches the version of the chromium-based browser you're using and the version number of the artifact is the same as Selenium's.
  Given the user navigate to Coursera Home page              # stepDefinition.WebDevelopStep.the_user_navigate_to_coursera_home_page()

    Embedding Web Development Test [image/png 295611 bytes]

  When the user enter Web Development in SearchBox           # stepDefinition.WebDevelopStep.the_user_enter_web_development_in_search_box()

    Embedding Web Development Test [image/png 457691 bytes]

  And the user click the English language checkbox           # stepDefinition.WebDevelopStep.the_user_click_the_english_language_checkbox()

    Embedding Web Development Test [image/png 59968 bytes]

  And the user clicked Beginner level checkbox               # stepDefinition.WebDevelopStep.the_user_clicked_beginner_level_checkbox()

    Embedding Web Development Test [image/png 90265 bytes]

The Course Details Are:
First Course Name: Meta Front-End Developer
  Then the user get the First Course Name and Click it       # stepDefinition.WebDevelopStep.the_user_get_the_first_course_name_and_click_it()

    Embedding Web Development Test [image/png 608244 bytes]

Rating Of First Course: 4.7
Duration Of First Course: 7 months at 6 hours a week
  And the user get the Rating and Duration of First Course   # stepDefinition.WebDevelopStep.the_user_get_the_rating_and_duration_of_first_course()

    Embedding Web Development Test [image/png 608727 bytes]

Second Course Name: Introduction to Web Development
  And the user get the Second Course name and Click it       # stepDefinition.WebDevelopStep.the_user_get_the_second_course_name_and_click_it()

    Embedding Web Development Test [image/png 607248 bytes]

Rating Of Second Course: 4.7
Duration Of Second Course: Approx. 21 hours to complete

  Then the user get the Rating and Duration of Second Course # stepDefinition.WebDevelopStep.the_user_get_the_rating_and_duration_of_second_course()

    Embedding Web Development Test [image/png 607784 bytes]


@sanity @regression
Scenario: Language Learning Test                    # Features/2LangLearningTest.feature:4
Feb 29, 2024 11:31:03 AM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
WARNING: Unable to find CDP implementation matching 118
Feb 29, 2024 11:31:03 AM org.openqa.selenium.chromium.ChromiumDriver lambda$new$5
WARNING: Unable to find version of CDP to use for 118.0.5993.71. You may need to include a dependency on a specific version of the CDP using something similar to `org.seleniumhq.selenium:selenium-devtools-v86:4.17.0` where the version ("v86") matches the version of the chromium-based browser you're using and the version number of the artifact is the same as Selenium's.
  Given the user is on the Web Development page     # stepDefinition.LangLearningStep.the_user_is_on_the_web_development_page()

    Embedding Language Learning Test [image/png 180075 bytes]

  When the user set Language Learning in Searchbox  # stepDefinition.LangLearningStep.the_user_set_Language_Learning_in_Searchbox()

    Embedding Language Learning Test [image/png 253017 bytes]

  When the user click the ShowMore in languages     # stepDefinition.LangLearningStep.the_user_click_the_ShowMore_in_languages()

    Embedding Language Learning Test [image/png 204199 bytes]

The Languages are:
English (1,645)
Spanish (1,101)
Arabic (1,012)
French (997)
Chinese (China) (993)
Portuguese (Brazil) (988)
German (977)
Indonesian (976)
Hindi (972)
Italian (971)
Swedish (970)
Dutch (969)
Greek (969)
Polish (969)
Thai (969)
Turkish (969)
Ukrainian (969)
Russian (946)
Kazakh (894)
Hungarian (697)
Japanese (90)
Korean (88)
Chinese (Traditional) (5)
Hebrew (2)

The Total No of Languages:24

  Then the user get total No of Language and Verify # stepDefinition.LangLearningStep.the_user_get_total_No_of_Language_and_Verify()

    Embedding Language Learning Test [image/png 653365 bytes]

The Levels are:
Beginner (738)
Intermediate (692)
Advanced (67)
Mixed (126)

The Total No of Levels:4

  And the user get total no of Levels and Verify    # stepDefinition.LangLearningStep.the_user_get_total_no_of_Levels_and_Verify()

    Embedding Language Learning Test [image/png 489831 bytes]


@sanity @segression
Scenario: For Enterprise Test                               # Features/3ForEnterpriseTest.feature:4
Feb 29, 2024 11:31:54 AM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
WARNING: Unable to find CDP implementation matching 118
Feb 29, 2024 11:31:55 AM org.openqa.selenium.chromium.ChromiumDriver lambda$new$5
WARNING: Unable to find version of CDP to use for 118.0.5993.71. You may need to include a dependency on a specific version of the CDP using something similar to `org.seleniumhq.selenium:selenium-devtools-v86:4.17.0` where the version ("v86") matches the version of the chromium-based browser you're using and the version number of the artifact is the same as Selenium's.
  Given the user is on the Home Page                        # stepDefinition.ForEnterpriseStep.the_user_is_on_the_home_page()

    Embedding For Enterprise Test [image/png 295611 bytes]

  When the user click the For Enterprise link               # stepDefinition.ForEnterpriseStep.the_user_click_the_For_Enterprise_link()

    Embedding For Enterprise Test [image/png 708177 bytes]

  And the user click the What we offer link                 # stepDefinition.ForEnterpriseStep.the_user_click_the_What_we_offer_link()

    Embedding For Enterprise Test [image/png 96847 bytes]

  And the user click the Learn More option                  # stepDefinition.ForEnterpriseStep.the_user_click_the_Learn_More_option()

    Embedding For Enterprise Test [image/png 822031 bytes]

  And the user set the FirstName and LastName               # stepDefinition.ForEnterpriseStep.the_user_set_the_FirstName_and_LastName()

    Embedding For Enterprise Test [image/png 97666 bytes]

  And the user set Email Address and Phone Number           # stepDefinition.ForEnterpriseStep.the_user_set_email_address_and_phone_number()

    Embedding For Enterprise Test [image/png 103663 bytes]

  And the user select Institute Type and set Institute Name # stepDefinition.ForEnterpriseStep.the_user_select_institute_type_and_set_institute_name()

    Embedding For Enterprise Test [image/png 107342 bytes]

  And the user select Job Role and Department               # stepDefinition.ForEnterpriseStep.the_user_select_job_role_and_department()

    Embedding For Enterprise Test [image/png 113949 bytes]

  And the user select Describe and Expected Learning        # stepDefinition.ForEnterpriseStep.the_user_select_describe_and_expected_learning()

    Embedding For Enterprise Test [image/png 148851 bytes]

  And the user select Country and State                     # stepDefinition.ForEnterpriseStep.the_user_select_country_and_state()

    Embedding For Enterprise Test [image/png 157854 bytes]

The Status Of Email Address is: 
Please enter your work email address

  Then the user click submit and verify Email               # stepDefinition.ForEnterpriseStep.the_user_click_submit_and_verify_Email()

    Embedding For Enterprise Test [image/png 146597 bytes]

┌──────────────────────────────────────────────────────────────────────────┐
│ View your Cucumber Report at:                                            │
│ https://reports.cucumber.io/reports/3b608ed5-c503-442c-a549-d29584b2eed4 │
│                                                                          │
│ This report will self-destruct in 24h.                                   │
│ Keep reports forever: https://reports.cucumber.io/profile                │
└──────────────────────────────────────────────────────────────────────────┘

