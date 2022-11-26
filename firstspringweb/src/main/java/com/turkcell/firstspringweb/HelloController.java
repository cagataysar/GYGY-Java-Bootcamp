package com.turkcell.firstspringweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/helloworld")
	public String helloworld() {
		return "hello spring world";
	}
}
