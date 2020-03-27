package com.kubilaycicek.mynotepro.repository;

import com.kubilaycicek.mynotepro.entity.Note;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NoteRepository extends MongoRepository<Note, String> {
}
