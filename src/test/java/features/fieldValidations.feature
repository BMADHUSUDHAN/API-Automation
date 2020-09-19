Feature:  Validating Admin login API

Scenario: Verify if Admin able login successfully using AdminloginAPI
     Given AdminloginAPI Payload
     When user calls "AdminloginAPI" using with post http request
     Then the API call got success with status code 200
     And "status" in response body "success"