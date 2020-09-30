package com.vue.HelloVueSpring;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@GetMapping("/helloworld")
	String hello() {
		return new String("he1zxc");
		
		
	}
}
