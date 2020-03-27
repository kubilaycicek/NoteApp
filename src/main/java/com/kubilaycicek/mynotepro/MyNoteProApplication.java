package com.kubilaycicek.mynotepro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class MyNoteProApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyNoteProApplication.class, args);
    }
}
