package me.leolin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ModuleGatewayZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModuleGatewayZuulApplication.class, args);
	}
}
