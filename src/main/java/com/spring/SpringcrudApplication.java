package com.spring;

//SWAGGER 2
//
//1) adding swagger dependency
//2) enable swagger2
//3)  configure swagger
//4) application.properties file

// http://localhost:8082/v2/api-docs    / on Postman
// http://localhost:8082/swagger-ui.html  / browser
// https://springbootswaggersetup.herokuapp.com/
// https://springbootswaggersetup.herokuapp.com/swagger-ui.html

//use postman to run this
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringcrudApplication {

	public static void main(String[] args) {
		System.out.println("inside main");
		SpringApplication.run(SpringcrudApplication.class, args);
	}

}
