$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "OctaCart Application",
  "description": "",
  "id": "octacart-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login test",
  "description": "",
  "id": "octacart-application;login-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user should be on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters email and password and click login button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user will be on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.user_should_be_on_login_page()"
});
formatter.result({
  "duration": 8087839221,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.user_enters_email_and_password_and_click_login_button()"
});
formatter.result({
  "duration": 367410322,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.user_will_be_on_home_page()"
});
formatter.result({
  "duration": 10368379,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "verify logo",
  "description": "",
  "id": "octacart-application;verify-logo",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "user should be on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "user should see OctaCart logo",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.user_should_be_on_login_page()"
});
formatter.result({
  "duration": 7172540319,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.user_should_see_OctaCart_logo()"
});
formatter.result({
  "duration": 92538965,
  "status": "passed"
});
formatter.uri("registerPage.feature");
formatter.feature({
  "line": 1,
  "name": "register a user on online Website",
  "description": "",
  "id": "register-a-user-on-online-website",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "register test",
  "description": "",
  "id": "register-a-user-on-online-website;register-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user should be on home page for register",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user clicks on register page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user fills all details",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "click submit button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user should get successfull register msg",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterStepDef.user_should_be_on_home_page_for_register()"
});
formatter.result({
  "duration": 7361373733,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDef.user_clicks_on_register_page()"
});
formatter.result({
  "duration": 1030506251,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDef.user_fills_all_details()"
});
formatter.result({
  "duration": 1053078670,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDef.click_submit_button()"
});
formatter.result({
  "duration": 628417488,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDef.user_should_get_successfull_register_msg()"
});
formatter.result({
  "duration": 52345,
  "status": "passed"
});
});