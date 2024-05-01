package com.springboot.SpringBootCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//it is a combination of @ComponentScan,@Configuration and @EnableAutoConfiguration.
public class SpringBootCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCloudApplication.class, args);
	}

}
