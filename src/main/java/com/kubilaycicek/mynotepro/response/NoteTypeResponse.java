package com.kubilaycicek.mynotepro.response;

import com.kubilaycicek.mynotepro.entity.NoteType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NoteTypeResponse {
    NoteType noteType;
}
