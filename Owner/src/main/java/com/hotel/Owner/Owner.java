package com.hotel.Owner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Owner
{
	public static void main(String[] args)
	{
		SpringApplication.run(Owner.class, args);
		System.out.println("Owner microservice started...");
	}
}