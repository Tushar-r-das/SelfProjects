package com.springmongo.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;

//import com.springmongo.api.resource.EmployeeController;

@SpringBootApplication //(scanBasePackages="com.springmongo.api.resource.EmployeeController")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
