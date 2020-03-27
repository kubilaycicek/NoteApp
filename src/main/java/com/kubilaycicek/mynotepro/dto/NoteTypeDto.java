package com.kubilaycicek.mynotepro.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NoteTypeDto {
    private String id;
    private String title;
    private String description;
}
