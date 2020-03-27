package com.kubilaycicek.mynotepro.dto;

import com.kubilaycicek.mynotepro.entity.NoteType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NoteDto {
    private long id;
    private String title;
    private String content;
    private NoteType noteType;
}
