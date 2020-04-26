package com.kubilaycicek.mynotepro.service.impl;

import com.kubilaycicek.mynotepro.entity.NoteType;
import com.kubilaycicek.mynotepro.repository.NoteTypeRepository;
import com.kubilaycicek.mynotepro.response.NoteTypeListResponse;
import com.kubilaycicek.mynotepro.response.NoteTypeResponse;
import com.kubilaycicek.mynotepro.service.NoteTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class NoteTypeServiceImpl implements NoteTypeService {
    private final NoteTypeRepository noteTypeRepository;

    @Override
    public NoteTypeResponse addNoteType(NoteType noteType) {
        return new NoteTypeResponse(noteTypeRepository.save(noteType));
    }

    @Override
    public NoteTypeResponse updateNoteType(NoteType noteType) {
        NoteType noteTypeDb = noteTypeRepository.findFirstById(noteType.getId());
        if (noteTypeDb != null) {
            noteTypeDb.setTitle(noteType.getTitle());
            noteTypeDb.setDescription(noteType.getDescription());
            return new NoteTypeResponse(noteTypeDb);
        } else {
            throw new IllegalArgumentException("Note does not exist !");
        }
    }

    @Override
    public NoteTypeResponse getNoteType(String id) {
        return new NoteTypeResponse(noteTypeRepository.findFirstById(id));
    }

    @Override
    public NoteTypeListResponse getNoteTypes() {
        return new NoteTypeListResponse(noteTypeRepository.findAll());
    }

    @Override
    public void removeNoteType(String id) {
        noteTypeRepository.deleteById(id);
    }
}
