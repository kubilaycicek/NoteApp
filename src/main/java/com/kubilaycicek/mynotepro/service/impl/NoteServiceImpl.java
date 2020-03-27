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
        return new NoteResponse(noteRepository.save(note));
    }

    @Override
    public NoteResponse updateNote(Note note) {
        Note noteDb = noteRepository.findFirstById(note.getId());
        if (noteDb != null) {
            noteDb.setTitle(note.getTitle());
            noteDb.setContent(note.getContent());
            noteDb.setNoteType(note.getNoteType());
            return new NoteResponse(noteDb);
        } else {
            throw new IllegalArgumentException("Note does not exist !");
        }
    }

    @Override
    public NoteResponse getNote(String id) {
        return new NoteResponse(noteRepository.findFirstById(id));
    }

    @Override
    public NoteListResponse getNotes() {
        return new NoteListResponse(noteRepository.findAll());
    }

    @Override
    public void removeNote(String id) {
        noteRepository.deleteById(id);
    }
}
