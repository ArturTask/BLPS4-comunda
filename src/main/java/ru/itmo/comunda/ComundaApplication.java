package ru.itmo.comunda;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableProcessApplication
@SpringBootApplication
public class ComundaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComundaApplication.class, args);
    }

}
