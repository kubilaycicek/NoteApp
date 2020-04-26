package com.kubilaycicek.mynotepro.service;

import com.kubilaycicek.mynotepro.entity.NoteType;
import com.kubilaycicek.mynotepro.response.NoteTypeListResponse;
import com.kubilaycicek.mynotepro.response.NoteTypeResponse;

public interface NoteTypeService {
    NoteTypeResponse addNoteType(NoteType noteType);
    NoteTypeResponse updateNoteType(NoteType noteType);
    NoteTypeResponse getNoteType(String id);
    NoteTypeListResponse getNoteTypes();
    void removeNoteType(String id);
}
