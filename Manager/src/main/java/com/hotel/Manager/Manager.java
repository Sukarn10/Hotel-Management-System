package com.hotel.Manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Manager
{
	public static void main(String[] args)
	{
		SpringApplication.run(Manager.class, args);
		System.out.println("Manager microservice started...");
	}
}