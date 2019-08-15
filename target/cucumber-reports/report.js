$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/Payments.feature");
formatter.feature({
  "line": 1,
  "name": "Automate a booking up to a declined payment",
  "description": "",
  "id": "automate-a-booking-up-to-a-declined-payment",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "User is in homePage and set language",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is in homePage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "change language\tto English",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "i login",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionPayments.user_is_in_homePage()"
});
formatter.result({
  "duration": 6696311356,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionPayments.change_language_to_English()"
});
formatter.result({
  "duration": 3546360878,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionPayments.i_login()"
});
formatter.result({
  "duration": 1903492434,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "1.Prueba",
  "description": "",
  "id": "automate-a-booking-up-to-a-declined-payment;1.prueba",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "i make a booking from \"DUB\" to \"SXF\" on \"22/10/2019\" for \"2\" adults and \"1\" child",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "tap on Website terms and on Let´s go",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "i tap on first choice fly, plus option and tap on Continue Btn",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "seats selection is loaded",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "tap on \u0027Ok, Got it\u0027 Btn",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "select seats and confirm",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "i tap on \u0027Check out\u0027 Btn",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "\u0027payment page\u0027 is launched",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I send passengers1 data \"Eduardo\" and \"Gonzalez\"",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I send passengers2 data \"Patricio\" and \"Gonzalez\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I send passengers3 data \"Rodolfo\" and \"Langostino\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I add insurance",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I send telephone \"666666666\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I pay for booking with card details \"5555555555555557\" , \"10/2019\" , \"265\" and \"Eduardo Gonzalez\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I send billing address \"Street La Esquina\", \"Madrid\" , \"23456\" , \"Spain\" and tap on PayNow Btn",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "card error message appears",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "DUB",
      "offset": 23
    },
    {
      "val": "SXF",
      "offset": 32
    },
    {
      "val": "22/10/2019",
      "offset": 41
    },
    {
      "val": "2",
      "offset": 58
    },
    {
      "val": "1",
      "offset": 73
    }
  ],
  "location": "StepDefinitionPayments.i_make_a_booking_from_something_to_something_on_something_for_something_adults_and_something_child(String,String,String,String,String)"
});
formatter.result({
  "duration": 9261150625,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionPayments.tap_on_Website_terms_and_on_Let_s_go()"
});
formatter.result({
  "duration": 202288932,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionPayments.i_tap_on_first_choice_fly_and_plus_option()"
});
formatter.result({
  "duration": 7118574347,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionPayments.seats_selection_is_loaded()"
});
formatter.result({
  "duration": 14043,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionPayments.tap_on_Ok_Got_it_Btn()"
});
formatter.result({
  "duration": 2945442574,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionPayments.select_seats_and_confirms()"
});
formatter.result({
  "duration": 4907285683,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionPayments.i_tap_on_check_out_btn()"
});
formatter.result({
  "duration": 2066199211,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionPayments.payment_page_is_launched()"
});
formatter.result({
  "duration": 3354888,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Eduardo",
      "offset": 25
    },
    {
      "val": "Gonzalez",
      "offset": 39
    }
  ],
  "location": "StepDefinitionPayments.i_send_passengers1_data_something_and_something(String,String)"
});
formatter.result({
  "duration": 4569733859,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Patricio",
      "offset": 25
    },
    {
      "val": "Gonzalez",
      "offset": 40
    }
  ],
  "location": "StepDefinitionPayments.i_send_passengers2_data_something_and_something(String,String)"
});
formatter.result({
  "duration": 519738195,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Rodolfo",
      "offset": 25
    },
    {
      "val": "Langostino",
      "offset": 39
    }
  ],
  "location": "StepDefinitionPayments.i_send_passengers3_data_something_and_something(String,String)"
});
formatter.result({
  "duration": 401788929,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionPayments.i_add_insurance()"
});
formatter.result({
  "duration": 153669992,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "666666666",
      "offset": 18
    }
  ],
  "location": "StepDefinitionPayments.i_send_telephone_something(String)"
});
formatter.result({
  "duration": 324433827,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5555555555555557",
      "offset": 37
    },
    {
      "val": "10/2019",
      "offset": 58
    },
    {
      "val": "265",
      "offset": 70
    },
    {
      "val": "Eduardo Gonzalez",
      "offset": 80
    }
  ],
  "location": "StepDefinitionPayments.i_pay_for_booking_with_card_details_and(String,String,String,String)"
});
formatter.result({
  "duration": 728329791,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Street La Esquina",
      "offset": 24
    },
    {
      "val": "Madrid",
      "offset": 45
    },
    {
      "val": "23456",
      "offset": 56
    },
    {
      "val": "Spain",
      "offset": 66
    }
  ],
  "location": "StepDefinitionPayments.i_send_billing_address_something_something_something_something_and_tap_on_paynow_btn(String,String,String,String)"
});
formatter.result({
  "duration": 1716257187,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionPayments.card_error_message_appears()"
});
formatter.result({
  "duration": 4402528905,
  "status": "passed"
});
});