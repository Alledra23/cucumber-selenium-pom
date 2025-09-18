UI Test Automation Framework with Cucumber, Java, Selenium, and Gradle

OVERVIEW

This project is a simple UI Test Automation Framework built using:

1. Cucumber → for writing test cases in Gherkin format

2. Selenium WebDriver → for browser automation

3. Java → programming language

4. Gradle → build & dependency management

5. Page Object Model (POM) design pattern → to keep test code clean, reusable, and maintainable

The framework is designed to test the login functionality of SauceDemo as an example.


TEST COVERAGE

Feature: Login

1. Valid Login
User can log in with correct credentials.

2. Invalid Login
User enters wrong credentials → error message is displayed.

3. Boundary Test
User tries login with empty username → handled correctly.

HOW TO CLONE AND RUN

1. Clone repository:
git clone https://github.com/Alledra23/cucumber-selenium-pom.git
cd cucumber-selenium-pom

2. Jalankan test:
./gradlew cucumber 
./gradlew cucumber -Ptags="@login"
./gradlew cucumber -Ptags="@valid-login"
./gradlew cucumber -Ptags="@invalid-login"
./gradlew cucumber -Ptags="@boundary-login"


REPORTS

Hasil report bisa dilihat di: build/reports/cucumber.html

NOTES

1. Default browser used: Chrome (headless)

2. You can change browser options in BaseTest.java

TECH STACK

1. Java 17

2. Gradle 7+

3. Selenium WebDriver 4

4. Cucumber 7 (BDD)

5. JUnit 4
