package com.learn.microservices.limits.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.microservices.limits.bean.Configuration;
import com.learn.microservices.limits.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController {
	@Autowired
	Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfiguration() {
		return new LimitConfiguration(configuration.getMinimum(), configuration.getMaximum());
	}
		
}
