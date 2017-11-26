package me.leolin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ModuleProviderUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModuleProviderUserApplication.class, args);
	}
}
