package com.MasterDigitalMarketing.DigitalMasters;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class DigitalMastersApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigitalMastersApplication.class, args);
		
		System.out.println("Application Started..");
		
	}

}
