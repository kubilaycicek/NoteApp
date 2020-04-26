package com.kubilaycicek.mynotepro.request;

import com.kubilaycicek.mynotepro.entity.Note;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NoteRequest {
    private Note note;
}
