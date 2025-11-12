package com.security.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringSecurityTestController {
  @GetMapping("/hello")
  public String hello() {
    return "Hello, Spring Security!";
  }
}
