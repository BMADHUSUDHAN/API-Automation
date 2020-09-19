package stepDefinition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.TestDataBuild;
import resources.Utils;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class StepDefinition extends Utils {

	RequestSpecification res;
	ResponseSpecification resspec;
	Response response;
	TestDataBuild data = new TestDataBuild();

	@Given("AdminloginAPI Payload")
	public void Admin_loginAPI_payload() throws IOException {
		// Write code here that turns the phrase above into concrete actions
		res= given().spec(requestSpecification()).body(data.adminLoginpayLoad());
		
		
	}

	@When("user calls {string} using with post http request")
	public void user_calls_using_with_post_http_request(String string) throws FileNotFoundException {
		// Write code here that turns the phrase above into concrete actions
		
		
				
	}

	@Then("the API call got success with status code {int}")
	public void the_api_call_got_success_with_status_code(Integer int1) {
		resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
	response =res.when().post("baseurl").then().spec(resspec).extract().response();

		//assertEquals(response.getStatusCode(),200);
		
	//}

//	@Then("{string} in response body {string}")
	//public void in_response_body(String keyvalue, String ExpectedValue) {
    //String resp=response.asString();
    //JsonPath js=new JsonPath(resp);
    //assertEquals(js.get(keyvalue).toString(),ExpectedValue);
    
	//}

}
}