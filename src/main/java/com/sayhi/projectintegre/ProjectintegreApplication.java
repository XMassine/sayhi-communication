package com.sayhi.projectintegre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ProjectintegreApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectintegreApplication.class, args);
	}

}
