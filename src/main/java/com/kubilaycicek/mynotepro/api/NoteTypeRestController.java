package com.kubilaycicek.mynotepro.api;

import com.kubilaycicek.mynotepro.constant.Mappings;

import com.kubilaycicek.mynotepro.request.NoteRequest;
import com.kubilaycicek.mynotepro.request.NoteTypeRequest;
import com.kubilaycicek.mynotepro.response.NoteTypeListResponse;
import com.kubilaycicek.mynotepro.response.NoteTypeResponse;
import com.kubilaycicek.mynotepro.service.NoteTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@RequestMapping(Mappings.API_PATH + Mappings.NOTE_TYPE_PATH)
@RestController
public class NoteTypeRestController {
    private final NoteTypeService noteTypeService;

    @PostMapping("/")
    public ResponseEntity<NoteTypeResponse> addNoteType(@RequestBody NoteTypeRequest noteTypeRequest) {
        return ResponseEntity.ok(noteTypeService.addNoteType(noteTypeRequest.getNoteType()));
    }

    @PutMapping("/")
    public ResponseEntity<NoteTypeResponse> updateNoteType(@RequestBody NoteTypeRequest noteTypeRequest) {
        return ResponseEntity.ok(noteTypeService.updateNoteType(noteTypeRequest.getNoteType()));
    }

    @DeleteMapping("/delete/{id}")
    public void deleteNoteType(@PathVariable String id) {
        noteTypeService.removeNoteType(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity<NoteTypeResponse> getNoteType(@PathVariable String id) {
        return ResponseEntity.ok(noteTypeService.getNoteType(id));
    }

    @GetMapping("/list")
    public ResponseEntity<NoteTypeListResponse> getList() {
        return ResponseEntity.ok(noteTypeService.getNoteTypes());
    }
}