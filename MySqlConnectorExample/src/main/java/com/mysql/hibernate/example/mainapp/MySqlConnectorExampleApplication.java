package com.mysql.hibernate.example.mainapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
public class MySqlConnectorExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySqlConnectorExampleApplication.class, args);
	}

}
