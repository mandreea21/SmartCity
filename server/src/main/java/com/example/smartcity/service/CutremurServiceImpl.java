package com.example.smartcity.service;

import com.example.smartcity.dto.CutremurDto;
import com.example.smartcity.mapper.CutremurMapper;
import com.example.smartcity.model.Cutremur;
import com.example.smartcity.repository.CutremurRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CutremurServiceImpl implements CutremurService {
    @Autowired
    private final CutremurRepository cutremurRepository;

    @Override
    public CutremurDto getLastCutremur() {
        Cutremur cutremur = cutremurRepository.findFirstByOrderByDataDesc();
        cutremurRepository.deleteById(cutremur.getCutremurID());
        CutremurDto cutremurDto = CutremurMapper.cutremurToCutremurDto(cutremur);
        return cutremurDto;
    }

    @Override
    public List<CutremurDto> getAllCutremure() {
        List<Cutremur> cutremure = cutremurRepository.findAll();
        List<CutremurDto> cutremureDto = new ArrayList<>();
        for (Cutremur cutremur : cutremure) {
            cutremureDto.add(CutremurMapper.cutremurToCutremurDto(cutremur));
        }
        return cutremureDto;
    }

    @Override
    public CutremurDto saveCutremur(Cutremur cutremur) {
        cutremur = cutremurRepository.save(cutremur);
        CutremurDto cutremurDto = CutremurMapper.cutremurToCutremurDto(cutremur);
        return cutremurDto;
    }
}
