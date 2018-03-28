package com.chrisbeech.hello.controllers;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller class for the simple web application.
 * </p>
 * This class is flagged as a @RestController meaning it's ready for use by
 * Spring MVC to handle requests. In this simple example we have mapped the "/"
 * to the index() method which returns a simple message.
 * 
 * @author ChrisBeech
 */
@RestController
public class HelloController {

	/**
	 * Simple method which will be invoked when requests are made on the root of the
	 * application context.
	 * 
	 * @return Hello world message
	 */
	@RequestMapping("/")
	public String index() {

		// retrieve current date time
		LocalDateTime localDateTime = LocalDateTime.now();
		// return hello world message
		return "Hello from Spring-Boot @ " + localDateTime;
	}
}