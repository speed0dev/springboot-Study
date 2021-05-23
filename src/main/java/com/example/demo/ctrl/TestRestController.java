package com.example.demo.ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiImplicitParam;

@RestController
public class TestRestController {

	
	@ApiImplicitParam(name="name", value="이름", required=true)
	@GetMapping("/greet")
	public Object getList() {
		
		
		return "AAAAAAAAA";
	}
	
	//
	
}
