$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FacebookApp.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "Login Feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 22,
  "name": "Login to Facebook App",
  "description": "",
  "id": "login-feature;login-to-facebook-app",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "Open Chrome, start the \"https://facebook.com\" application.",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "User enters valid username \"656565d6\" and password \"dtdttxttx\"",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "User should be able to login",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://facebook.com",
      "offset": 24
    }
  ],
  "location": "FacebookSmokeTest.open_Chrome_start_the(String)"
});
formatter.result({
  "duration": 10748586139,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "656565d6",
      "offset": 28
    },
    {
      "val": "dtdttxttx",
      "offset": 52
    }
  ],
  "location": "FacebookSmokeTest.user_enters_valid_username_and_password(String,String)"
});
formatter.result({
  "duration": 689611266,
  "status": "passed"
});
formatter.match({
  "location": "FacebookSmokeTest.user_should_be_able_to_login()"
});
formatter.result({
  "duration": 6783743241,
  "status": "passed"
});
formatter.uri("FacebookLoginWithNoOFData.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "Login Feature with more data",
  "description": "I want to use this template for my feature file",
  "id": "login-feature-with-more-data",
  "keyword": "Feature",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 24,
  "name": "Test Facebook Login with more no of data.",
  "description": "",
  "id": "login-feature-with-more-data;test-facebook-login-with-more-no-of-data.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "Open Chrome, start the \"https://facebook.com\" application.",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "User enters valid username \"656565d6\" and password \"dtdttxttx\"",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "User should be able to login",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://facebook.com",
      "offset": 24
    }
  ],
  "location": "FacebookSmokeTest.open_Chrome_start_the(String)"
});
formatter.result({
  "duration": 6560489920,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "656565d6",
      "offset": 28
    },
    {
      "val": "dtdttxttx",
      "offset": 52
    }
  ],
  "location": "FacebookSmokeTest.user_enters_valid_username_and_password(String,String)"
});
formatter.result({
  "duration": 607902308,
  "status": "passed"
});
formatter.match({
  "location": "FacebookSmokeTest.user_should_be_able_to_login()"
});
formatter.result({
  "duration": 5997960977,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 34,
  "name": "Test Facebook Login with more no of data.",
  "description": "",
  "id": "login-feature-with-more-data;test-facebook-login-with-more-no-of-data.",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 33,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 36,
  "name": "Open Chrome, start the \"\u003capplication\u003e\" application.",
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "User enters valid username \"\u003cusername\u003e\" and password \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "User should be able to login",
  "keyword": "Then "
});
formatter.examples({
  "line": 40,
  "name": "",
  "description": "",
  "id": "login-feature-with-more-data;test-facebook-login-with-more-no-of-data.;",
  "rows": [
    {
      "cells": [
        "application",
        "username",
        "password"
      ],
      "line": 41,
      "id": "login-feature-with-more-data;test-facebook-login-with-more-no-of-data.;;1"
    },
    {
      "cells": [
        "https://facebook.com",
        "Anitya4335353",
        "dyddtddtr"
      ],
      "line": 42,
      "id": "login-feature-with-more-data;test-facebook-login-with-more-no-of-data.;;2"
    },
    {
      "cells": [
        "https://facebook.com",
        "Swayam87g88",
        "vtuyyrdy"
      ],
      "line": 43,
      "id": "login-feature-with-more-data;test-facebook-login-with-more-no-of-data.;;3"
    },
    {
      "cells": [
        "https://facebook.com",
        "tytyfyyyyc",
        "dtred65d6"
      ],
      "line": 44,
      "id": "login-feature-with-more-data;test-facebook-login-with-more-no-of-data.;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 42,
  "name": "Test Facebook Login with more no of data.",
  "description": "",
  "id": "login-feature-with-more-data;test-facebook-login-with-more-no-of-data.;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    },
    {
      "line": 33,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 36,
  "name": "Open Chrome, start the \"https://facebook.com\" application.",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "User enters valid username \"Anitya4335353\" and password \"dyddtddtr\"",
  "matchedColumns": [
    1,
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "User should be able to login",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://facebook.com",
      "offset": 24
    }
  ],
  "location": "FacebookSmokeTest.open_Chrome_start_the(String)"
});
formatter.result({
  "duration": 3974391155,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Anitya4335353",
      "offset": 28
    },
    {
      "val": "dyddtddtr",
      "offset": 57
    }
  ],
  "location": "FacebookSmokeTest.user_enters_valid_username_and_password(String,String)"
});
formatter.result({
  "duration": 679307490,
  "status": "passed"
});
formatter.match({
  "location": "FacebookSmokeTest.user_should_be_able_to_login()"
});
formatter.result({
  "duration": 3330835117,
  "status": "passed"
});
formatter.scenario({
  "line": 43,
  "name": "Test Facebook Login with more no of data.",
  "description": "",
  "id": "login-feature-with-more-data;test-facebook-login-with-more-no-of-data.;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    },
    {
      "line": 33,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 36,
  "name": "Open Chrome, start the \"https://facebook.com\" application.",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "User enters valid username \"Swayam87g88\" and password \"vtuyyrdy\"",
  "matchedColumns": [
    1,
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "User should be able to login",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://facebook.com",
      "offset": 24
    }
  ],
  "location": "FacebookSmokeTest.open_Chrome_start_the(String)"
});
formatter.result({
  "duration": 3831383524,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Swayam87g88",
      "offset": 28
    },
    {
      "val": "vtuyyrdy",
      "offset": 55
    }
  ],
  "location": "FacebookSmokeTest.user_enters_valid_username_and_password(String,String)"
});
formatter.result({
  "duration": 661460935,
  "status": "passed"
});
formatter.match({
  "location": "FacebookSmokeTest.user_should_be_able_to_login()"
});
formatter.result({
  "duration": 1654444684,
  "status": "passed"
});
formatter.scenario({
  "line": 44,
  "name": "Test Facebook Login with more no of data.",
  "description": "",
  "id": "login-feature-with-more-data;test-facebook-login-with-more-no-of-data.;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    },
    {
      "line": 33,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 36,
  "name": "Open Chrome, start the \"https://facebook.com\" application.",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "User enters valid username \"tytyfyyyyc\" and password \"dtred65d6\"",
  "matchedColumns": [
    1,
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "User should be able to login",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://facebook.com",
      "offset": 24
    }
  ],
  "location": "FacebookSmokeTest.open_Chrome_start_the(String)"
});
formatter.result({
  "duration": 3864146451,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tytyfyyyyc",
      "offset": 28
    },
    {
      "val": "dtred65d6",
      "offset": 54
    }
  ],
  "location": "FacebookSmokeTest.user_enters_valid_username_and_password(String,String)"
});
formatter.result({
  "duration": 623645665,
  "status": "passed"
});
formatter.match({
  "location": "FacebookSmokeTest.user_should_be_able_to_login()"
});
formatter.result({
  "duration": 1740034422,
  "status": "passed"
});
});