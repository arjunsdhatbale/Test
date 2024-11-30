package com.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

	@RequestMapping(method = RequestMethod.GET,path = "/home")
	public String home() {
		System.out.println("This is home page api...");
		return "home";
	}
}
