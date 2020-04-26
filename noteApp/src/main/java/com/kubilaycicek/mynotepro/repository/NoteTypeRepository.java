package com.kubilaycicek.mynotepro.repository;

import com.kubilaycicek.mynotepro.entity.NoteType;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NoteTypeRepository extends MongoRepository<NoteType, String> {
    NoteType findFirstById(String id);

}
