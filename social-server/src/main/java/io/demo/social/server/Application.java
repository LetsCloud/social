package io.demo.social.server;

import java.lang.String;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import io.demo.social.server.config.AppProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
