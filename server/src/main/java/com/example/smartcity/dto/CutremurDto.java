package com.example.smartcity.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class CutremurDto {
    private String magnitudine;
    private String latitudine;
    private String longitudine;
    private int adancime;
    private int anCutremur;
    private int lunaCutremur;
    private int ziuaCutremur;
    private int ora;
    private int minut;
}
