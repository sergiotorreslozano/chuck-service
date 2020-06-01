package com.chuck.service;

import java.util.Optional;
import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class ChuckController {

	private ChuckRepository repository;

	private Random r = new Random();

	/**
	 * @param repository
	 */
	ChuckController(ChuckRepository repository) {
		super();
		this.repository = repository;
	}

	@RequestMapping("/chuck")
	public @ResponseBody Optional<ChuckFact> greeting() {
		return repository.findById(r.nextInt(20));
	}
	
}
