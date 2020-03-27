package com.kubilaycicek.mynotepro.service.impl;

import com.kubilaycicek.mynotepro.entity.Note;
import com.kubilaycicek.mynotepro.repository.NoteRepository;
import com.kubilaycicek.mynotepro.response.NoteListResponse;
import com.kubilaycicek.mynotepro.response.NoteResponse;
import com.kubilaycicek.mynotepro.service.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class NoteServiceImpl implements NoteService {

    private final NoteRepository noteRepository;

    @Override
    public NoteResponse addNote(Note note) {
        return null;
    }

    @Override
    public NoteResponse updateNote(Note note) {
        return null;
    }

    @Override
    public NoteResponse getNote(String id) {
        return null;
    }

    @Override
    public NoteListResponse getNotes(Note note) {
        return null;
    }

    @Override
    public void removeNote(Note note) {

    }
}
