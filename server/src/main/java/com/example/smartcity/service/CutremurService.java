package com.example.smartcity.service;

import com.example.smartcity.dto.CutremurDto;
import com.example.smartcity.model.Cutremur;

import java.util.List;

public interface CutremurService {
    CutremurDto getLastCutremur();
    List<CutremurDto> getAllCutremure();
    CutremurDto saveCutremur(Cutremur cutremur);
}
