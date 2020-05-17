package com.bkp.learning.controller;

import java.sql.Timestamp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

	@RequestMapping(method = RequestMethod.GET,path = "/index")
	public String getWelcomeMessage() {
		return "Welcome to MyFirstSpringBoot "+ new Timestamp(System.currentTimeMillis());
	}
	
}
