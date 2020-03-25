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
  "line": 31,
  "name": "Filtering the page",
  "description": "",
  "id": "swaglabs-website;filtering-the-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 30,
      "name": "@SwagLabs_TS4"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "user launches the web application",
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "user opens SwagLabs home page",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "user clicks the login button",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user clicks dropdown button",
  "keyword": "Then "
});
formatter.match({
  "location": "FilterStep.Chrome_Launch_Fail()"
});
formatter.result({
  "duration": 25849334800,
  "status": "passed"
});
formatter.match({
  "location": "FilterStep.HomePage_Open_Fail()"
});
formatter.result({
  "duration": 4208328600,
  "status": "passed"
});
formatter.match({
  "location": "FilterStep.UserName_Enter()"
});
formatter.result({
  "duration": 1943361000,
  "status": "passed"
});
formatter.match({
  "location": "FilterStep.LoginBtn_Click_Fail()"
});
formatter.result({
  "duration": 27334349700,
  "status": "passed"
});
formatter.match({
  "location": "FilterStep.Filter_Select()"
});
formatter.result({
  "duration": 3829989500,
  "status": "passed"
});
});