package com.kubilaycicek.mynotepro.service;

import com.kubilaycicek.mynotepro.entity.Note;
import com.kubilaycicek.mynotepro.response.NoteListResponse;
import com.kubilaycicek.mynotepro.response.NoteResponse;

public interface NoteTypeService {
    NoteResponse addNoteType(Note note);
    NoteResponse updateNoteType(Note note);
    NoteResponse getNoteType(String id);
    NoteListResponse getNoteTypes(Note note);
    void removeNoteType(Note note);
}
