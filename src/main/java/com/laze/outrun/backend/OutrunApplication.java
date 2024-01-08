package com.laze.outrun.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class OutrunApplication {

    public static void main(String[] args) {
        SpringApplication.run(OutrunApplication.class, args);
    }

}
