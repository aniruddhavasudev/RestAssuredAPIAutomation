package com.qa.rest.tests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.equalTo;
public class GetCallBDD {

	@Test
	public void test_numberOfCirecuits2022_Season() {
		
//	given().
//	when().
//	then().
//	assert()
		
		given().
		when().
			get("http://ergast.com/api/f1/2022/Circuits.json").
		then().
			assertThat().
			statusCode(200).
			and().
			body("MRData.CircuitTable.Circuits.circuitId", hasSize(22)).
			and().
			header("Content-Length",equalTo("4987"));
		
		
	}
	
}
