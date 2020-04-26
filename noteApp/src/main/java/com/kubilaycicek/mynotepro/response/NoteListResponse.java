package com.kubilaycicek.mynotepro.response;

import com.kubilaycicek.mynotepro.entity.Note;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NoteListResponse {
    List<Note> noteList;
}
