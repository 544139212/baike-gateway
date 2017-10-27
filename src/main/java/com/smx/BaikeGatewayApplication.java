package com.smx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class BaikeGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaikeGatewayApplication.class, args);
	}
}
