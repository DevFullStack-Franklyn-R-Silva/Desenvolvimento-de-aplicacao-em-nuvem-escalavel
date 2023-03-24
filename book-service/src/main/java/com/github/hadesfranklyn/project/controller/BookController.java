package com.github.hadesfranklyn.project.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.hadesfranklyn.project.model.Book;

@RestController
@RequestMapping("book-service")
public class BookController {



	@Autowired
	private Environment environment;

	

	@GetMapping(value = "/{id}/{currency}")
	public Book findBook(
			@PathVariable("id") Long id, 
			@PathVariable("currency") String currency
			) {


		

		var port = environment.getProperty("local.server.port");
		

		return new Book(1L, "Nigel", "Docker", new Date(),
				Double.valueOf(13.8), currency, port);
	}
}