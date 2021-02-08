package com.reto2.businesscustomerv1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class BusinessCustomerV1Application {

	public static void main(String[] args) {
		SpringApplication.run(BusinessCustomerV1Application.class, args);
	}

}
