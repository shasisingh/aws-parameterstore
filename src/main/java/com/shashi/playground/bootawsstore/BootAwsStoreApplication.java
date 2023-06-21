package com.shashi.playground.bootawsstore;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootAwsStoreApplication implements CommandLineRunner {

	@Value("${db.username}")
	private String dbUserName;

	public static void main(String[] args) {
		SpringApplication.run(BootAwsStoreApplication.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println("********************************************************");
		System.out.println("Reading from Aws Parameter store   ==> " + dbUserName);
		System.out.println("********************************************************");
	}
}
