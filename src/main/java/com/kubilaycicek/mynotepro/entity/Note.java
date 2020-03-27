package com.kubilaycicek.mynotepro.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Notes")
public class Note {
    @Id
    private long id;
    private String title;
    private String content;
    private NoteType noteType;
}
