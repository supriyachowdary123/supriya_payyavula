$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/Features/login.feature");
formatter.feature({
  "line": 2,
  "name": "SwagLabs Website",
  "description": "I want to use this template for my feature file",
  "id": "swaglabs-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SwagLabs"
    }
  ]
});
formatter.scenario({
  "line": 49,
  "name": "Login to the website with wrong password",
  "description": "",
  "id": "swaglabs-website;login-to-the-website-with-wrong-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 48,
      "name": "@SwagLabs_TS6"
    }
  ]
});
formatter.step({
  "line": 50,
  "name": "user will launches to the webapplication.",
  "keyword": "Given "
});
formatter.step({
  "line": 51,
  "name": "the user is going to opens the swaglabs Homepage.",
  "keyword": "When "
});
formatter.step({
  "line": 52,
  "name": "the user entered the username.",
  "keyword": "Then "
});
formatter.step({
  "line": 53,
  "name": "the user enters wrong password.",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "clicks on the login button then the user is not navigate to the next page.",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageWrngPassStep.Chrome_Launch_Fail()"
});
formatter.result({
  "duration": 45764196200,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageWrngPassStep.HomePage_Open_Fail()"
});
formatter.result({
  "duration": 19185872700,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageWrngPassStep.UserName_Enter()"
});
formatter.result({
  "duration": 2922156000,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageWrngPassStep.Password_Enter_Fail()"
});
formatter.result({
  "duration": 1993427000,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageWrngPassStep.LoginBtn_Click_Fail()"
});
formatter.result({
  "duration": 5734087300,
  "status": "passed"
});
});