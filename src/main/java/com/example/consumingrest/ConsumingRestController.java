package com.example.consumingrest;

import org.springframework.web.bind.annotation.GetMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

public class ConsumingRestController {

    private static final Logger log = LoggerFactory.getLogger(ConsumingRestController.class);

	// @GetMapping("/consumingrest")
	// public Greeting consumingrest(@RequestParam(value = "name", defaultValue = "World") String name) {
	// 	return new Greeting(counter.incrementAndGet(), String.format(template, name));
	// }

    // @Bean
	// public RestTemplate restTemplate(RestTemplateBuilder builder) {
	// 	return builder.build();
	// }

	// @Bean
	// public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
	// 	return args -> {
	// 		Quote quote = restTemplate.getForObject(
	// 				"https://quoters.apps.pcfone.io/api/random", Quote.class);
	// 		log.info(quote.toString());
	// 	};
	// }
}
