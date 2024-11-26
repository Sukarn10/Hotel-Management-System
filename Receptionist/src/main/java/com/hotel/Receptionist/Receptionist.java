package com.hotel.Receptionist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Receptionist
{
	public static void main(String[] args)
	{
		SpringApplication.run(Receptionist.class, args);
		System.out.println("Receptionist microservice started...");
	}
}