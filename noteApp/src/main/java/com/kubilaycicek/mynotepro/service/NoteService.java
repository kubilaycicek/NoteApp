package com.kubilaycicek.mynotepro.service;

import com.kubilaycicek.mynotepro.entity.Note;
import com.kubilaycicek.mynotepro.response.NoteListResponse;
import com.kubilaycicek.mynotepro.response.NoteResponse;

import java.awt.print.Pageable;

public interface NoteService {
    NoteResponse addNote(Note note);
    NoteResponse updateNote(Note note);
    NoteResponse getNote(String id);
    NoteListResponse getNotes();
    NoteListResponse getAllByTitle(String title);
    void removeNote(String id);

}
