package com.example.demogatewaymicrometertracing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Hooks;

@SpringBootApplication
public class DemoGatewayMicrometerTracingApplication {

	public static void main(String[] args) {
		Hooks.enableAutomaticContextPropagation();
		SpringApplication.run(DemoGatewayMicrometerTracingApplication.class, args);
	}

}
