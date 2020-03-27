package com.kubilaycicek.mynotepro.api;

import com.kubilaycicek.mynotepro.constant.Mappings;
import com.kubilaycicek.mynotepro.entity.NoteType;
import com.kubilaycicek.mynotepro.repository.NoteTypeRepository;
import com.kubilaycicek.mynotepro.service.NoteTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RequiredArgsConstructor
@RequestMapping(Mappings.API_PATH + Mappings.NOTE_TYPE_PATH)
@RestController
public class NoteTypeRestController {
    private final NoteTypeService noteTypeService;
}