package com.kubilaycicek.mynotepro;

import com.kubilaycicek.mynotepro.entity.NoteType;
import com.kubilaycicek.mynotepro.repository.NoteTypeRepository;
import com.mongodb.DBCollection;
import org.springframework.beans.factory.annotation.Autowired;
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
