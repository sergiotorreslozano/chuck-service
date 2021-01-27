package com.chuck.service;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Configuration;

/**
 * Simple loader
 * 
 * @author sergio.torres.lozano
 * 
 */
@Configuration
public class ChuckLoader {

	private ChuckRepository repository;

	/**
	 * @param repository
	 */
	ChuckLoader(ChuckRepository repository) {
		super();
		this.repository = repository;
	}
	
	
	@PostConstruct
	void init() {
		repository.save(new ChuckFact(0,
			"Chuck Norris will never have a heart attack. His heart isn't nearly foolish enough to attack him"));
		repository.save(new ChuckFact(1,
				"Chuck Norris was bitten by a cobra and after five days of excruciating pain... the cobra died"));
		repository.save(new ChuckFact(2,
				"He who laughs last, laughs best. He who laughs at Chuck Norris, it's definitely his last laugh."));
		repository.save(new ChuckFact(3,
				"The easiest way to determine Chuck Norris's age is to cut him in half and count the rings"));
		repository.save(new ChuckFact(4,
				"Chuck Norris is currently suing NBC, claiming Law and Order are trademarked names for his left and right legs"));
		repository.save(new ChuckFact(5,
				"Chuck Norris doesn't dial the wrong number. You answered the wrong phone"));
		repository.save(new ChuckFact(6,
				"Chuck Norris knows Victoria's secret"));
		repository.save(new ChuckFact(7,
				"If Chuck Norris was a Spartan in the movie 300, the movie would be called 1"));
		repository.save(new ChuckFact(8,
				"When Chuck Norris turned 18, his parents moved out"));
		repository.save(new ChuckFact(9,
				"When Chuck Norris swims in the ocean, the sharks are in a steel cage"));
		repository.save(new ChuckFact(10, "Chuck Norris counted to infinity… twice"));
		repository.save(new ChuckFact(11, "Chuck Norris can divide by zero"));
		repository.save(new ChuckFact(12, "Chuck Norris can speak Braille"));
		repository.save(new ChuckFact(13, "Chuck Norris once won a game of Connect Four in three moves"));
		repository.save(new ChuckFact(14, "The dark is afraid of Chuck Norris"));
		repository.save(new ChuckFact(15, "Chuck Norris can kill two stones with one bird"));
		repository.save(new ChuckFact(16, "Chuck Norris can play the violin with a piano"));
		repository.save(new ChuckFact(17, "Chuck Norris can build a snowman out of rain"));
		repository.save(new ChuckFact(18, "When Chuck Norris enters a room, he doesn’t turn the lights on, he turns the dark off"));
		repository.save(new ChuckFact(19, "Chuck Norris can tie his shoes with his feet"));
	}
	
	
}
