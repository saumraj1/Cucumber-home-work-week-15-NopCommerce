$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Test",
  "description": "As a user I want to login into nop commerce website",
  "id": "login-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5828917100,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should navigate to login page successfully",
  "description": "",
  "id": "login-test;user-should-navigate-to-login-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@smoke"
    },
    {
      "line": 3,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on login link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should able to see \"Welcome, Please Sign In!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 88040200,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.iClickOnLoginLink()"
});
formatter.result({
  "duration": 1140367200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome, Please Sign In!",
      "offset": 22
    }
  ],
  "location": "LoginPageSteps.iShouldAbleToSee(String)"
});
formatter.result({
  "duration": 40267400,
  "status": "passed"
});
formatter.after({
  "duration": 634537000,
  "status": "passed"
});
formatter.before({
  "duration": 3108677400,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "User Should LogOut SuccessFully",
  "description": "",
  "id": "login-test;user-should-logout-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@sanity"
    },
    {
      "line": 8,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I click on login link",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I enter email \"nidhilakhani2598@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter password \"Nidhi123\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I should login successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I should be able to see \"Log out\" option",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 43300,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.iClickOnLoginLink()"
});
formatter.result({
  "duration": 1117729600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "nidhilakhani2598@gmail.com",
      "offset": 15
    }
  ],
  "location": "LoginPageSteps.iEnterEmail(String)"
});
formatter.result({
  "duration": 90778400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nidhi123",
      "offset": 18
    }
  ],
  "location": "LoginPageSteps.iEnterPassword(String)"
});
formatter.result({
  "duration": 61034600,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 1059879000,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.iShouldLoginSuccessfully()"
});
formatter.result({
  "duration": 12300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Log out",
      "offset": 25
    }
  ],
  "location": "LoginPageSteps.iShouldBeAbleToSeeOption(String)"
});
formatter.result({
  "duration": 40104674900,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[contains(text(),\u0027Log out\u0027)]\"}\n  (Session info: chrome\u003d96.0.4664.110)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.0.0\u0027, revision: \u00273a21814679\u0027\nSystem info: host: \u0027LAPTOP-ECCE3OFG\u0027, ip: \u0027192.168.1.74\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_172\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [f5e842e0421b187d61105b3434face9b, findElement {using\u003dxpath, value\u003d//a[contains(text(),\u0027Log out\u0027)]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 96.0.4664.110, chrome: {chromedriverVersion: 96.0.4664.45 (76e4c1bb2ab46..., userDataDir: C:\\Users\\laxmi\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:60072}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:60072/devtoo..., se:cdpVersion: 96.0.4664.110, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: f5e842e0421b187d61105b3434face9b\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:139)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:559)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:383)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:375)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy22.getText(Unknown Source)\r\n\tat com.nopcommerce.pages.HomePage.verifyLogoutLink(HomePage.java:71)\r\n\tat com.nopcommerce.steps.LoginPageSteps.iShouldBeAbleToSeeOption(LoginPageSteps.java:47)\r\n\tat ✽.And I should be able to see \"Log out\" option(Login.feature:16)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 873041600,
  "status": "passed"
});
formatter.before({
  "duration": 2956152900,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "verify That User Should LogInSuccessFully WithValid Credentials",
  "description": "",
  "id": "login-test;verify-that-user-should-loginsuccessfully-withvalid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@sanity"
    },
    {
      "line": 17,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "I click on login link",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I enter email \"nidhilakhani2598@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I enter password \"Nidhi123\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 120300,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.iClickOnLoginLink()"
});
formatter.result({
  "duration": 1124861100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "nidhilakhani2598@gmail.com",
      "offset": 15
    }
  ],
  "location": "LoginPageSteps.iEnterEmail(String)"
});
formatter.result({
  "duration": 73660900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nidhi123",
      "offset": 18
    }
  ],
  "location": "LoginPageSteps.iEnterPassword(String)"
});
formatter.result({
  "duration": 63524300,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 460815000,
  "status": "passed"
});
formatter.after({
  "duration": 645203200,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 25,
  "name": "Verify the error message with invalid credentials",
  "description": "",
  "id": "login-test;verify-the-error-message-with-invalid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 24,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "I click on login link",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "I enter email \"\u003cemail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I enter password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I should see the error message \"\u003cerrorMessage\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 32,
  "name": "",
  "description": "Login was unsuccessful. Please correct the errors and try again.\\nNo customer account found",
  "id": "login-test;verify-the-error-message-with-invalid-credentials;",
  "rows": [
    {
      "cells": [
        "email",
        "password",
        "errorMessage"
      ],
      "line": 34,
      "id": "login-test;verify-the-error-message-with-invalid-credentials;;1"
    },
    {
      "cells": [
        "abc@gmail.com",
        "abc1234",
        "Login was unsuccessful. Please correct the errors and try again.\nNo customer account found"
      ],
      "line": 35,
      "id": "login-test;verify-the-error-message-with-invalid-credentials;;2"
    },
    {
      "cells": [
        "xyz@yahoo.com",
        "yhp1203",
        "Login was unsuccessful. Please correct the errors and try again.\nNo customer account found"
      ],
      "line": 36,
      "id": "login-test;verify-the-error-message-with-invalid-credentials;;3"
    },
    {
      "cells": [
        "ncp@ymail.com",
        "123220a",
        "Login was unsuccessful. Please correct the errors and try again.\nNo customer account found"
      ],
      "line": 37,
      "id": "login-test;verify-the-error-message-with-invalid-credentials;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2775473100,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "Verify the error message with invalid credentials",
  "description": "Login was unsuccessful. Please correct the errors and try again.\\nNo customer account found",
  "id": "login-test;verify-the-error-message-with-invalid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 24,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "I click on login link",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "I enter email \"abc@gmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I enter password \"abc1234\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I should see the error message \"Login was unsuccessful. Please correct the errors and try again.\nNo customer account found\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 38900,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.iClickOnLoginLink()"
});
formatter.result({
  "duration": 481284700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc@gmail.com",
      "offset": 15
    }
  ],
  "location": "LoginPageSteps.iEnterEmail(String)"
});
formatter.result({
  "duration": 62080400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc1234",
      "offset": 18
    }
  ],
  "location": "LoginPageSteps.iEnterPassword(String)"
});
formatter.result({
  "duration": 59481700,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 969069800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login was unsuccessful. Please correct the errors and try again.\nNo customer account found",
      "offset": 32
    }
  ],
  "location": "LoginPageSteps.iShouldSeeTheErrorMessage(String)"
});
formatter.result({
  "duration": 34772600,
  "status": "passed"
});
formatter.after({
  "duration": 653380000,
  "status": "passed"
});
formatter.before({
  "duration": 2848756500,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "Verify the error message with invalid credentials",
  "description": "Login was unsuccessful. Please correct the errors and try again.\\nNo customer account found",
  "id": "login-test;verify-the-error-message-with-invalid-credentials;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 24,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "I click on login link",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "I enter email \"xyz@yahoo.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I enter password \"yhp1203\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I should see the error message \"Login was unsuccessful. Please correct the errors and try again.\nNo customer account found\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 104600,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.iClickOnLoginLink()"
});
formatter.result({
  "duration": 1008514100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "xyz@yahoo.com",
      "offset": 15
    }
  ],
  "location": "LoginPageSteps.iEnterEmail(String)"
});
formatter.result({
  "duration": 76256000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "yhp1203",
      "offset": 18
    }
  ],
  "location": "LoginPageSteps.iEnterPassword(String)"
});
formatter.result({
  "duration": 59389400,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 922457500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login was unsuccessful. Please correct the errors and try again.\nNo customer account found",
      "offset": 32
    }
  ],
  "location": "LoginPageSteps.iShouldSeeTheErrorMessage(String)"
});
formatter.result({
  "duration": 32780700,
  "status": "passed"
});
formatter.after({
  "duration": 638954800,
  "status": "passed"
});
formatter.before({
  "duration": 2913187300,
  "status": "passed"
});
formatter.scenario({
  "line": 37,
  "name": "Verify the error message with invalid credentials",
  "description": "Login was unsuccessful. Please correct the errors and try again.\\nNo customer account found",
  "id": "login-test;verify-the-error-message-with-invalid-credentials;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 24,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "I click on login link",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "I enter email \"ncp@ymail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I enter password \"123220a\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I should see the error message \"Login was unsuccessful. Please correct the errors and try again.\nNo customer account found\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 64600,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.iClickOnLoginLink()"
});
formatter.result({
  "duration": 1187546700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ncp@ymail.com",
      "offset": 15
    }
  ],
  "location": "LoginPageSteps.iEnterEmail(String)"
});
formatter.result({
  "duration": 64751600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123220a",
      "offset": 18
    }
  ],
  "location": "LoginPageSteps.iEnterPassword(String)"
});
formatter.result({
  "duration": 61555000,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 998849000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login was unsuccessful. Please correct the errors and try again.\nNo customer account found",
      "offset": 32
    }
  ],
  "location": "LoginPageSteps.iShouldSeeTheErrorMessage(String)"
});
formatter.result({
  "duration": 34505500,
  "status": "passed"
});
formatter.after({
  "duration": 641113500,
  "status": "passed"
});
});