package mk;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class WebApp {

	public static void main(String[] args) {

		System.out.println("Version 16.04.2018 (changed type to web)");
		System.out.println("Environment variables");
		

		Map<String, String> env = System.getenv();
		for (String envName : env.keySet()) {
			System.out.format("%s=%s%n", envName, env.get(envName));
		}

		SpringApplication.run(WebApp.class, args);
	}

}
