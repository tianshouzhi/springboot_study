package com.tianshouzhi.springboot.deploy.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tianshouzhi on 2018/4/25.
 */
@RestController
public class HelloWorldController {
	@GetMapping("/hello")
	public String hello() {
		return "hello world";
	}
}
