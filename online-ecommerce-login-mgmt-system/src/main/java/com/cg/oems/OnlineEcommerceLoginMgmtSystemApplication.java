package com.cg.oems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OnlineEcommerceLoginMgmtSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineEcommerceLoginMgmtSystemApplication.class, args);
	}

}
