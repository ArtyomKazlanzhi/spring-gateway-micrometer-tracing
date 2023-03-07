package com.example.demogatewaymicrometertracing;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteConfiguration {
  private static final String URL = "http://localhost:8080";
  @Bean
  public RouteLocator myRouteLocator(RouteLocatorBuilder builder) {
    return builder.routes().route("test-route",
            route -> route.path("/route").filters(f -> f.prefixPath("/test")).uri(URL))
        .build();
  }
}
