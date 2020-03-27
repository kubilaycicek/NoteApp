package com.kubilaycicek.mynotepro.response;

import com.kubilaycicek.mynotepro.dto.NoteTypeDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NoteTypeResponse {
    NoteTypeDto noteTypeDto;
}
