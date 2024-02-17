package com.example.orderwarehouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
//@EnableWebSecurity
@SpringBootApplication
public class OrderWarehouseApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderWarehouseApplication.class, args);
	}

}
