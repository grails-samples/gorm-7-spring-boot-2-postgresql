package com.example.demo

import groovy.transform.CompileStatic
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration

@CompileStatic
@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
class DemoApplication {

	static void main(String[] args) {
		SpringApplication.run(DemoApplication, args)
	}

}
