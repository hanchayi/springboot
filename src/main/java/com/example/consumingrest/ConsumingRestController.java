package com.example.consumingrest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
// import org.springframework.boot.CommandLineRunner;
// import org.springframework.boot.web.client.RestTemplateBuilder;
// import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumingRestController {

	private static final Logger log = LoggerFactory.getLogger(ConsumingRestController.class);
	@GetMapping("/consumingrest")
	public String greeting() {
		return String.format("Hello %s", "ConsumingRestController");
	}

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