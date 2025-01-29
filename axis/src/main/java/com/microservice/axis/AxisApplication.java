package com.microservice.axis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;

@SpringBootApplication
public class AxisApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(AxisApplication.class, args);
		System.out.println("Hello World !!!");

	}

}
