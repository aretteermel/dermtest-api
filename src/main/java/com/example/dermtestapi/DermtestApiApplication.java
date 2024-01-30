package com.example.dermtestapi;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@Log4j2
@SpringBootApplication
@EntityScan(basePackages = "com.example.dermtestapi.doctor")
public class DermtestApiApplication {
    @Value("${environment}")
    private String environmentProperty;

    public static void main(String[] args) {
        SpringApplication.run(DermtestApiApplication.class, args);
    }

    @Bean
    ApplicationRunner applicationRunner(Environment environment) {
        return args -> log.info(
                "message from application-" + environmentProperty + ".properties: " +
                environment.getProperty("welcome.message"));
    }

}
