package com.example.smartcity.mapper;

import com.example.smartcity.dto.CutremurDto;
import com.example.smartcity.model.Cutremur;

public class CutremurMapper {
    public static CutremurDto cutremurToCutremurDto(Cutremur cutremur) {
        return CutremurDto.builder()
                .anCutremur(cutremur.getAnCutremur())
                .lunaCutremur(cutremur.getLunaCutremur())
                .ziuaCutremur(cutremur.getZiuaCutremur())
                .ora(cutremur.getOra())
                .latitudine(cutremur.getLatitudine())
                .longitudine(cutremur.getLongitudine())
                .adancime(cutremur.getAdancime())
                .magnitudine(cutremur.getMagnitudine())
                .build();
    }
}
