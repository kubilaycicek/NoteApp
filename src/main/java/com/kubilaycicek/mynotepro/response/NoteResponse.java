package com.kubilaycicek.mynotepro.response;

import com.kubilaycicek.mynotepro.dto.NoteDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NoteResponse {
    NoteDto noteDto;
}
