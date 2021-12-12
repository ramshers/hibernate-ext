package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.demo.model.map_one2one.Person;
import com.demo.model.map_one2one.PersonDetails;

@SpringBootApplication
public class HibernateExtApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateExtApplication.class, args);
	}

}
