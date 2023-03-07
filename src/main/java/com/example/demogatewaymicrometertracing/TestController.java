package com.example.demogatewaymicrometertracing;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {
  @GetMapping("/test/route")
  public String get(@RequestHeader(value = "traceparent", required = false) String traceparent) {
    log.info("traceparent: {}", traceparent);
    return "response";
  }
}
