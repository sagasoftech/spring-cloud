package com.sagasoftech.spring.cloud;

import java.util.function.Function;

import org.springframework.stereotype.Component;

@Component
public class test implements Function<String, String>{
	
	@Override
	public String apply(String t) {
		return "Serverless functional programming : example by " + t;
	}

}
