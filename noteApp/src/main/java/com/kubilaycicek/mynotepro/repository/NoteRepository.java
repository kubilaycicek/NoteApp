package com.kubilaycicek.mynotepro.repository;

import com.kubilaycicek.mynotepro.entity.Note;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface NoteRepository extends MongoRepository<Note, String> {
    Note findFirstById(String id);
    List<Note> findAllByTitle(String title);
}
