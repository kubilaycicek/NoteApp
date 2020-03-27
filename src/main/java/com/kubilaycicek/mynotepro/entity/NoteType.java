package com.kubilaycicek.mynotepro.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "NoteType")
public class NoteType {
    @Id
    private String id;
    private String title;
    private String description;

}
