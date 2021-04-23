package com.app.heroku.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping(value="/test")
	public String getMessage() {
		return "I worked on heroku";
	}

}
