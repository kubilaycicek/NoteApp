package com.kubilaycicek.mynotepro.service;

import com.kubilaycicek.mynotepro.entity.Note;
import com.kubilaycicek.mynotepro.response.NoteListResponse;
import com.kubilaycicek.mynotepro.response.NoteResponse;

import java.util.List;

public interface NoteService {
    NoteResponse addNote(Note note);
    NoteResponse updateNote(Note note);
    NoteResponse getNote(String id);
    NoteListResponse getNotes(Note note);
    void removeNote(Note note);

}
