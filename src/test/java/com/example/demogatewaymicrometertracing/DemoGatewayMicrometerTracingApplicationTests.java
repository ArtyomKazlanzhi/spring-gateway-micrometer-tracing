package com.example.demogatewaymicrometertracing;

import io.restassured.RestAssured;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DemoGatewayMicrometerTracingApplicationTests {

	@LocalServerPort
	private int port;

	@Test
	@DisplayName("Context startup")
	void test() {
		RestAssured.given().port(port)
				.when()
				.get("/actuator/health")
				.then().statusCode(200);
	}

}
