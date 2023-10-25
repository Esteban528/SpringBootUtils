package com.bytecode.core;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StartCmsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StartCmsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Log log = LogFactory.getLog(this.getClass());
		log.info("Hola");
	}
}