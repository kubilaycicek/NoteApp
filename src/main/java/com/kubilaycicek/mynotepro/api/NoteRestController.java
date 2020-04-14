package com.kubilaycicek.mynotepro.api;

import com.kubilaycicek.mynotepro.constant.Mappings;
import com.kubilaycicek.mynotepro.request.NoteRequest;
import com.kubilaycicek.mynotepro.response.NoteListResponse;
import com.kubilaycicek.mynotepro.response.NoteResponse;
import com.kubilaycicek.mynotepro.service.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping(Mappings.API_PATH + Mappings.NOTE_PATH)
@RestController
public class NoteRestController {
    private final NoteService noteService;

    @PostMapping("/")
    public ResponseEntity<NoteResponse> addNote(@RequestBody NoteRequest noteRequest) {
        return ResponseEntity.ok(noteService.addNote(noteRequest.getNote()));
    }

    @PutMapping("/")
    public ResponseEntity<NoteResponse> updateNote(@RequestBody NoteRequest noteRequest) {
        return ResponseEntity.ok(noteService.updateNote(noteRequest.getNote()));
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable String id) {
        noteService.removeNote(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity<NoteResponse> getNote(@PathVariable String id) {
        return ResponseEntity.ok(noteService.getNote(id));
    }

    @GetMapping("/list")
    public ResponseEntity<NoteListResponse> getList() {
        return ResponseEntity.ok(noteService.getNotes());
    }
}
