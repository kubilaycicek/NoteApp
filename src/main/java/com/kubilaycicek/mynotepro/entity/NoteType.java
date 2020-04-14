package com.kubilaycicek.mynotepro.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "NoteType")
public class NoteType extends BaseEntity {
    private String title;
    private String description;

}
