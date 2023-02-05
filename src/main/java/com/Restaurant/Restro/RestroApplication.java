package com.Restaurant.Restro;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestroApplication {

	public static void main(String[] args) {

		SpringApplication.run(RestroApplication.class, args);
		System.out.println("Restaurant Application Run Successfully");
	}

}
