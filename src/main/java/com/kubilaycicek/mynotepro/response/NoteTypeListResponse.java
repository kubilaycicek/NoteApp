package com.kubilaycicek.mynotepro.response;

import com.kubilaycicek.mynotepro.dto.NoteTypeDto;
import com.kubilaycicek.mynotepro.entity.NoteType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NoteTypeListResponse {
    List<NoteTypeDto> noteTypeDtoList;
}
