package com.kubilaycicek.mynotepro.response;

import com.kubilaycicek.mynotepro.entity.Note;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NoteResponse {
    Note note;
}
