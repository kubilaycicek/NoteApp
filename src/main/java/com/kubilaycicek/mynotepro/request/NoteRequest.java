package com.kubilaycicek.mynotepro.request;

import com.kubilaycicek.mynotepro.dto.NoteDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NoteRequest {
    private NoteDto noteDto;
}
