package com.kubilaycicek.mynotepro.service.impl;

import com.kubilaycicek.mynotepro.entity.Note;
import com.kubilaycicek.mynotepro.repository.NoteTypeRepository;
import com.kubilaycicek.mynotepro.response.NoteListResponse;
import com.kubilaycicek.mynotepro.response.NoteResponse;
import com.kubilaycicek.mynotepro.service.NoteTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class NoteTypeServiceImpl implements NoteTypeService {
    private final NoteTypeRepository noteTypeRepository;

    @Override
    public NoteResponse addNoteType(Note note) {
        return null;
    }

    @Override
    public NoteResponse updateNoteType(Note note) {
        return null;
    }

    @Override
    public NoteResponse getNoteType(String id) {
        return null;
    }

    @Override
    public NoteListResponse getNoteTypes(Note note) {
        return null;
    }

    @Override
    public void removeNoteType(Note note) {

    }
}
