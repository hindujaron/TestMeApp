$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Feature/Login.feature");
formatter.feature({
  "name": "Login Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login with valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I want to login to the app",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdeff.Login.i_want_to_login_to_the_app() in file:/C:/Users/A07216trng_M7A.05.19/eclipse-workspace/cucum/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter valid username and password",
  "keyword": "When "
});
formatter.match({
  "location": "stepdeff.Login.i_enter_valid_username_and_password() in file:/C:/Users/A07216trng_M7A.05.19/eclipse-workspace/cucum/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am logged in successfully by clicking the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdeff.Login.i_am_logged_in_successfully_by_clicking_the_login_button() in file:/C:/Users/A07216trng_M7A.05.19/eclipse-workspace/cucum/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be redirected to the home page",
  "keyword": "And "
});
formatter.match({
  "location": "stepdeff.Login.i_should_be_redirected_to_the_home_page() in file:/C:/Users/A07216trng_M7A.05.19/eclipse-workspace/cucum/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
});