package com.kubilaycicek.mynotepro.api;

import com.kubilaycicek.mynotepro.constant.Mappings;
import com.kubilaycicek.mynotepro.service.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping(Mappings.API_PATH + Mappings.NOTE_PATH)
@RestController
public class NoteRestController {
    private final NoteService noteService;
}
